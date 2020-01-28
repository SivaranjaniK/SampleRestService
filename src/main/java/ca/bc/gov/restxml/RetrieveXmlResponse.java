package ca.bc.gov.restxml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RetrieveXmlResponse {
	private String body;

	public RetrieveXmlResponse() {
	}

	public RetrieveXmlResponse(String body) {
		super();
		this.body = body;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "RetrieveXmlResponse [body=" + body + "]";
	}

}
