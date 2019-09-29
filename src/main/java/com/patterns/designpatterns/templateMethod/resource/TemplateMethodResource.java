package com.patterns.designpatterns.templateMethod.resource;


import com.patterns.designpatterns.templateMethod.domain.Facebook;
import com.patterns.designpatterns.templateMethod.domain.Linkedin;
import com.patterns.designpatterns.templateMethod.domain.Network;
import com.patterns.designpatterns.templateMethod.resource.request.SocialMediaRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(value = "/social-media")
public class TemplateMethodResource {

    private Network network;

    @PostMapping(value = "/facebook")
    @ResponseStatus(code = HttpStatus.OK)
    public String facebook(SocialMediaRequest socialMediaRequest) {
        network = new Facebook(socialMediaRequest.getUsername());
        network.logToObserver();
        return network.post(network.createMessage("Facebook"));
    }

    @PostMapping(value = "/linkedin")
    @ResponseStatus(code = HttpStatus.OK)
    public String linkedin(SocialMediaRequest socialMediaRequest) {
        network = new Linkedin(socialMediaRequest.getUsername());
        network.logToObserver();
        return network.post(network.createMessage("Linkedin"));
    }
}
