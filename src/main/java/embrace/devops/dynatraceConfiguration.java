package embrace.devops;

import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.values.OfValues;

@Operations(dynatraceOperations.class)
public class dynatraceConfiguration {
	@Parameter
	private String url;
	@Parameter
	private String token;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPAT() {
		return token;
	}
	public void setPAT(String token) {
		this.token = token;
	}

}
