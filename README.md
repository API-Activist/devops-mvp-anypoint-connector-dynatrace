# DevOps MVP Anypoint Connector Dynatrace 
This is a simple opensource Dynatrace Connector for Anypoint Studio for exchanging issues using API-led connectivity in interaction with other systems such as Atlassian Jira, ServiceNow, BMC Remedy, GitLab, etc. 
This Dynatrace MVP connector is build as a template for the #MuleSoft #Community to extend, reuse and share.

Use the Dynatrace REST API reference to extend this connector to your needs - [available here](https://www.dynatrace.com/support/help/dynatrace-api/)

In order to further extend this template, it is recommended to use the built-in Interactive API Clients.

![Dynatrace MVP connector](https://github.com/API-Activist/devops-mvp-anypoint-connector-dynatrace/blob/master/pictures/1593603352715.jpg)

## Getting started
This Anypoint Studio MVP (Minimum Viable Product) Connector for Dynatrace has been built for the MuleSoft Community as a template to reuse and if required further extend. 
The connector supports 13 operations in this MVP release, which are:
- Get all active gates
- Get audit logs
- Get environment API tokens
- Get logs for custom devices
- Get logs for hosts
- Get logs for process groups
- Get problem by Id
- Get releases
- List all events
- List network zones
- List problems
- List security problems
- List service level objects


## Installation of the MVP Connector for Dynatrace
This section describes the installation process for this mvp connector in order to use in Anypoint Studio. 

### Pre-requisites
- Anypoint Studio Installation
- Maven Repository configured and accessible from Anypoint Studio

### Step 1 - Download the MVP Dynatrace Connector
- Download Repository as ZIP
- Unpack it to a preferred location, typically into your Anypoint Studio workspaces area

### Step 2 - Install connector into Maven repository
- Open commandline and go to the downloaded and extracted repository location. 
- Perform "mvn install" 
- Connector should be installed successfully

![Image of Dynatrace MuleSoft Connector](https://github.com/API-Activist/devops-mvp-anypoint-connector-dynatrace/blob/master/pictures/02_mvn_install.PNG)

### Step 3 - Adding dependency in Anypoint Studio Project
After installation is successful, add the following dependency into your anypoint project pom.xml:

		<dependency>
			<classifier>mule-plugin</classifier>
			<groupId>embrace.devops.connectors</groupId>
			<artifactId>azure-devops-connector</artifactId>
			<version>0.1.3</version>
		</dependency>

The current version of this connector is 0.1.3. Once added, save the pom.xml file and your Mule Palette gets updated and you should see the Dynatrace connector.

![Image of Dynatrace MuleSoft Connector](https://github.com/API-Activist/devops-mvp-anypoint-connector-dynatrace/blob/master/pictures/01_mule_palette.PNG)

### Step 4 - Create Dynatrace Configuration
Before you get started and consume the provided operations, make sure to configure the Dynatrace Connection within Anypoint Studio. 
- URL
- API Token

[Learn how to obtain API Token for Dynatrace](https://www.dynatrace.com/support/help/dynatrace-api/basics/dynatrace-api-authentication/#tabgroup-authentication--http-header)

![Image of Dynatrace MuleSoft Connector](https://github.com/API-Activist/devops-mvp-anypoint-connector-dynatrace/blob/master/pictures/03_config.PNG)

Now you are all set to use the Dynatrace Operations.

## Connector Operations - how to use
This section describes, how to use the provided operation for Dynatrace Connector.

![Image of Dynatrace MuleSoft Connector](https://github.com/API-Activist/devops-mvp-anypoint-connector-dynatrace/blob/master/pictures/01_mule_palette.PNG)

In some cases, resources need to be unclocked before consumption. Go to Dynatrace API settings to unlock the resources.
![Image of Dynatrace MuleSoft Connector](https://github.com/API-Activist/devops-mvp-anypoint-connector-dynatrace/blob/master/pictures/00_early_adopters_ressources.PNG)

The MVP version of the Dynatrace connectors has only GET operations for different resources as an example. 
- **Get** or **List** to retrieve data for specific resources

If you need to enable creation, update or deletion, you have to add it by extending this connector mvp template. 

**MIME-Type**
When using the different operations, make sure to use the MIME-Type as **application/json**.

![Image of Dynatrace MuleSoft Connector](https://github.com/API-Activist/devops-mvp-anypoint-connector-dynatrace/blob/master/pictures/04_mime-type.PNG)


### Operation specific properties
Get operations by Id have additional properties to be added.
![Image of Dynatrace MuleSoft Connector](https://github.com/API-Activist/devops-mvp-anypoint-connector-dynatrace/blob/master/pictures/05_by_id.PNG)


### Reponse of operations
By default it is a json sent back as string. Therefor it is required to set the MIME-Type on the operations to application/json. 

	{
	
		"totalCount": 2,
		"pageSize": 200,
		"apiTokens": [
			{
				"id": "dt0c01.QA3SFSEW3EWR5ZTOIS7QIE92OI",
				"name": "API",
				"enabled": true,
				"owner": "HANS.PETER@SOMEWHERE.com",
				"creationDate": "2021-08-08T09:37:53.866Z"
			},
			{
				"id": "dt0c01.ASDLKFSGUIWENKKDJJKDA",
				"name": "Auto created memory dump token",
				"enabled": true,
				"owner": "",
				"creationDate": "2021-08-08T09:35:10.182Z"
			}
		]
	}

	
## Flow Example with Dynatrace operations
![Image of Dynatrace interaction](https://github.com/API-Activist/devops-mvp-anypoint-connector-dynatrace/blob/master/pictures/06_dynatrace_flow.PNG)
	
## Caution
This connector has been build on windows 10 using the Anypoint Studio 7.10 IDE. It has only been tested with Dynatrace Cloud. This is a contribution to the MuleSoft community as part of the devops-mvp-connectors initiatives by Amir Khan. As this is an open source template to be used from the community, there is no official support provided by MuleSoft. Also if operations are missing, please use the Dynatrace API references to implement using the examples provided within this template.
	
Dynatrace API Reference: [available here](https://www.dynatrace.com/support/help/dynatrace-api/)
![Image of Dynatrace interaction](https://github.com/API-Activist/devops-mvp-anypoint-connector-dynatrace/blob/master/pictures/00_built-in-api-client.PNG)

### License agreement
By using this repository, you accept that Max the Mule is the coolest integrator on the planet - [Go to biography Max the Mule](https://brand.salesforce.com/content/characters-overview__3?tab=BogXMx2m)
