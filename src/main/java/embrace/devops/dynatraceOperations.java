package embrace.devops;

import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;

import javax.net.ssl.HttpsURLConnection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class dynatraceOperations {

	private static final Logger LOGGER = LoggerFactory.getLogger(dynatraceOperations.class);
	
	@MediaType(value = ANY, strict = false)
	@Alias("Get-environment-api-tokens")
	public String getEnvApiTokens(@Config dynatraceConfiguration dtConfig) throws IOException, InterruptedException {
    	LOGGER.info("Dynatrace getEnvApiTokens entered");  		

		String responseBody;
		String url_in = dtConfig.getUrl();
    	String url = url_in + "/api/v2/apiTokens";
		
		responseBody = getRequest(dtConfig, url);

		return responseBody;
		
		
	}	

	@MediaType(value = ANY, strict = false)
	@Alias("Get-all-active-gates")
	public String getEnvActiveGates(@Config dynatraceConfiguration dtConfig) throws IOException, InterruptedException {
    	LOGGER.info("Dynatrace getEnvActiveGates entered");  		

		String responseBody;
		String url_in = dtConfig.getUrl();
    	String url = url_in + "/api/v2/activeGates";
		
		responseBody = getRequest(dtConfig, url);

		return responseBody;
		
		
	}	

	@MediaType(value = ANY, strict = false)
	@Alias("Get-audit-logs")
	public String getEnvAuditLogs(@Config dynatraceConfiguration dtConfig) throws IOException, InterruptedException {
    	LOGGER.info("Dynatrace getEnvAuditLogs entered");  		

		String responseBody;
		String url_in = dtConfig.getUrl();
    	String url = url_in + "/api/v2/auditlogs";
		
		responseBody = getRequest(dtConfig, url);

		return responseBody;
		
		
	}	

	@MediaType(value = ANY, strict = false)
	@Alias("List-problems")
	public String getEnvProblems(@Config dynatraceConfiguration dtConfig) throws IOException, InterruptedException {
    	LOGGER.info("Dynatrace getEnvProblems entered");  		

		String responseBody;
		String url_in = dtConfig.getUrl();
    	String url = url_in + "/api/v2/problems";
		
		responseBody = getRequest(dtConfig, url);

		return responseBody;
		
		
	}	

	@MediaType(value = ANY, strict = false)
	@Alias("Get-problem-by-Id")
	public String getEnvProblemById(@Config dynatraceConfiguration dtConfig, @ParameterGroup(name="Id") dtParameterId dtProblemId) throws IOException, InterruptedException {
    	LOGGER.info("Dynatrace getEnvProblemById entered");  		

		String responseBody;
		String url_in = dtConfig.getUrl();
    	String url = url_in + "/api/v2/problems/" + dtProblemId.getId();
		
		responseBody = getRequest(dtConfig, url);

		return responseBody;
		
		
	}	

	@MediaType(value = ANY, strict = false)
	@Alias("Get-releases")
	public String getEnvReleases(@Config dynatraceConfiguration dtConfig) throws IOException, InterruptedException {
    	LOGGER.info("Dynatrace getEnvReleases entered");  		

		String responseBody;
		String url_in = dtConfig.getUrl();
    	String url = url_in + "/api/v2/releases";
		
		responseBody = getRequest(dtConfig, url);

		return responseBody;
		
		
	}	

	@MediaType(value = ANY, strict = false)
	@Alias("List-network-zones")
	public String getEnvNetworkZones(@Config dynatraceConfiguration dtConfig) throws IOException, InterruptedException {
    	LOGGER.info("Dynatrace getEnvNetworkZones entered");  		

		String responseBody;
		String url_in = dtConfig.getUrl();
    	String url = url_in + "/api/v2/networkZones";
		
		responseBody = getRequest(dtConfig, url);

		return responseBody;
		
		
	}	


	@MediaType(value = ANY, strict = false)
	@Alias("List-security-problems")
	public String getEnvSecProblems(@Config dynatraceConfiguration dtConfig) throws IOException, InterruptedException {
    	LOGGER.info("Dynatrace getEnvSecProblems entered");  		

		String responseBody;
		String url_in = dtConfig.getUrl();
    	String url = url_in + "/api/v2/securityProblems";
		
		responseBody = getRequest(dtConfig, url);

		return responseBody;
		
		
	}	


	@MediaType(value = ANY, strict = false)
	@Alias("List-service-level-objects")
	public String getEnvSLOs(@Config dynatraceConfiguration dtConfig) throws IOException, InterruptedException {
    	LOGGER.info("Dynatrace getEnvSLOs entered");  		

		String responseBody;
		String url_in = dtConfig.getUrl();
    	String url = url_in + "/api/v2/slo";
		
		responseBody = getRequest(dtConfig, url);

		return responseBody;
		
		
	}	

	@MediaType(value = ANY, strict = false)
	@Alias("List-all-events")
	public String getEnvEvents(@Config dynatraceConfiguration dtConfig) throws IOException, InterruptedException {
    	LOGGER.info("Dynatrace getEnvSLOs entered");  		

		String responseBody;
		String url_in = dtConfig.getUrl();
    	String url = url_in + "/api/v1/events";
		
		responseBody = getRequest(dtConfig, url);

		return responseBody;
		
		
	}	

	
	@MediaType(value = ANY, strict = false)
	@Alias("Get-logs-for-custom-devices")
	public String getCustomDeviceLogsById(@Config dynatraceConfiguration dtConfig, @ParameterGroup(name="Custom-Device-Id") dtParameterId dtDeviceId) throws IOException, InterruptedException {
    	LOGGER.info("Dynatrace getCustomDeviceLogsById entered");  		

		String responseBody;
		String url_in = dtConfig.getUrl();
    	String url = url_in + "/api/v1/entity/infrastructure/custom-devices/" + dtDeviceId.getId() + "/logs";
		
		responseBody = getRequest(dtConfig, url);

		return responseBody;
		
		
	}	

	@MediaType(value = ANY, strict = false)
	@Alias("Get-logs-for-hosts")
	public String getHostLogsById(@Config dynatraceConfiguration dtConfig, @ParameterGroup(name="Host-Id") dtParameterId dtDeviceId) throws IOException, InterruptedException {
    	LOGGER.info("Dynatrace getHostLogsById entered");  		

		String responseBody;
		String url_in = dtConfig.getUrl();
    	String url = url_in + "/api/v1/entity/infrastructure/hosts/" + dtDeviceId.getId() + "/logs";
		
		responseBody = getRequest(dtConfig, url);

		return responseBody;
		
		
	}	
	
	
	@MediaType(value = ANY, strict = false)
	@Alias("Get-logs-for-process-groups")
	public String getProcessGroupsLogsById(@Config dynatraceConfiguration dtConfig, @ParameterGroup(name="Process-Group-Id") dtParameterId dtDeviceId) throws IOException, InterruptedException {
    	LOGGER.info("Dynatrace getProcessGroupsLogsById entered");  		

		String responseBody;
		String url_in = dtConfig.getUrl();
    	String url = url_in + "/api/v1/entity/infrastructure/process-groups/" + dtDeviceId.getId() + "/logs";
		
		responseBody = getRequest(dtConfig, url);

		return responseBody;
		
		
	}	
	
	private String getRequest(@Config dynatraceConfiguration dtConfig, String dtURL) throws IOException, InterruptedException {

		StringBuilder responseBodyReturn;
		int responseCode = 0;
		
		String pat = dtConfig.getPAT();

		
    	URL url = new URL(dtURL);
    	LOGGER.info("Dynatrace Request-url: " + url);  		
    	
    	URLConnection conn = url.openConnection();

    	if(conn instanceof HttpsURLConnection){
			LOGGER.info("Processing HTTPS request");
			HttpsURLConnection https = (HttpsURLConnection) conn;
	    	https.setRequestMethod("GET");
	    	https.addRequestProperty("Accept", "*/*");
	    	
	    	String basicAuth = "Api-Token " + pat;
	    	
	    	https.setRequestProperty ("Authorization", basicAuth);
	    	
        	responseCode = https.getResponseCode();
            InputStream inputStream;
            if (200 <= responseCode && responseCode <= 299) {
                inputStream = https.getInputStream();
            } else {
                inputStream = https.getErrorStream();
            }

            BufferedReader in = new BufferedReader(
                new InputStreamReader(
                    inputStream));

            StringBuilder responseBody = new StringBuilder();
            String currentLine;

            while ((currentLine = in.readLine()) != null) 
            	responseBody.append(currentLine);

            in.close();
            
            responseBodyReturn = responseBody;

    	} 
    	else {
    		LOGGER.info("Processing HTTP request");
        	HttpURLConnection http = (HttpURLConnection) conn;
        	http.setRequestMethod("GET");
        	http.addRequestProperty("Accept", "*/*");
        	
	    	/*String userCredentials = ":" + pat;*/
	    	String basicAuth = "Api-Token " + pat;

	    	http.setRequestProperty ("Authorization", basicAuth);
        	
        	responseCode = http.getResponseCode();
            InputStream inputStream;
            if (200 <= responseCode && responseCode <= 299) {
                inputStream = http.getInputStream();
            } else {
                inputStream = http.getErrorStream();
            }

            BufferedReader in = new BufferedReader(
                new InputStreamReader(
                    inputStream));

            StringBuilder responseBody = new StringBuilder();
            String currentLine;

            while ((currentLine = in.readLine()) != null) 
            	responseBody.append(currentLine);

            in.close();

            responseBodyReturn = responseBody;
    	}

    	

    	
    	LOGGER.info("Dynatrace ReturnCode: " + String.valueOf(responseCode));
    	

		return responseBodyReturn.toString();
		
		
	}	


}
