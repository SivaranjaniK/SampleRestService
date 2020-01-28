package ca.bc.gov.restxml;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class RetrieveXmlController {

	@RequestMapping(value = "/retrieve", method = RequestMethod.GET, consumes = MediaType.ALL_VALUE, produces = "application/xml")
	@ResponseBody
	public RetrieveXmlResponse retrieveXml() {
		ResponseEntity<RetrieveXmlResponse> responseEntity = new RestTemplate()
				.getForEntity("http://localhost:8180/test", RetrieveXmlResponse.class);
		return responseEntity.getBody();
	}

}
