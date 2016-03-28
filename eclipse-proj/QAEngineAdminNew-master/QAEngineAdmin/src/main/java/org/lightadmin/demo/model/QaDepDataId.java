package org.lightadmin.demo.model;
// Generated Nov 1, 2015 1:04:48 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * QaDepDataId generated by hbm2java
 */
@Embeddable
public class QaDepDataId implements java.io.Serializable {

	private String depId;
	private Long flowId;
	private Long stepId;

	public QaDepDataId() {
	}

	public QaDepDataId(String depId, Long flowId, Long stepId) {
		this.depId = depId;
		this.flowId = flowId;
		this.stepId = stepId;
	}

	@Column(name = "DEP_ID", nullable = false, length = 20)
	public String getDepId() {
		return this.depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	@Column(name = "FLOW_ID", nullable = false, precision = 10, scale = 0)
	public Long getFlowId() {
		return this.flowId;
	}

	public void setFlowId(Long flowId) {
		this.flowId = flowId;
	}

	@Column(name = "STEP_ID", nullable = false, precision = 10, scale = 0)
	public Long getStepId() {
		return this.stepId;
	}

	public void setStepId(Long stepId) {
		this.stepId = stepId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof QaDepDataId))
			return false;
		QaDepDataId castOther = (QaDepDataId) other;

		return ((this.getDepId() == castOther.getDepId()) || (this.getDepId() != null && castOther.getDepId() != null
				&& this.getDepId().equals(castOther.getDepId()))) && (this.getFlowId() == castOther.getFlowId())
				&& (this.getStepId() == castOther.getStepId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDepId() == null ? 0 : this.getDepId().hashCode());
		result = 37 * result + this.getFlowId().intValue();
		result = 37 * result + this.getStepId().intValue();
		return result;
	}

}
