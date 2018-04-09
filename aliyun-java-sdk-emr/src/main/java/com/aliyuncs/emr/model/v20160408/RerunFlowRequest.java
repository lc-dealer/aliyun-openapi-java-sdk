/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class RerunFlowRequest extends RpcAcsRequest<RerunFlowResponse> {
	
	public RerunFlowRequest() {
		super("Emr", "2016-04-08", "RerunFlow");
	}

	private String flowInstanceId;

	private Long resourceOwnerId;

	private String projectId;

	private Boolean reRunFail;

	public String getFlowInstanceId() {
		return this.flowInstanceId;
	}

	public void setFlowInstanceId(String flowInstanceId) {
		this.flowInstanceId = flowInstanceId;
		if(flowInstanceId != null){
			putQueryParameter("FlowInstanceId", flowInstanceId);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public Boolean getReRunFail() {
		return this.reRunFail;
	}

	public void setReRunFail(Boolean reRunFail) {
		this.reRunFail = reRunFail;
		if(reRunFail != null){
			putQueryParameter("ReRunFail", reRunFail.toString());
		}
	}

	@Override
	public Class<RerunFlowResponse> getResponseClass() {
		return RerunFlowResponse.class;
	}

}
