package com.upskilling.employmentservice.dto;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Schema(
        description = "Organization DTO Model Info"
)
public class OrganizationDto {
	 private  Long id;
	    @Schema(
	            description = "Organization Name"
	    )
	    private String organizationName;

	    @Schema(
	            description = "Organization Name"
	    )
	    private String organizationDescription;

	    @Schema(
	            description = "Organization Name"
	    )
	    private String organizationCode;

	    @Schema(
	            description = "Organization Created Date"
	    )
	    private LocalDateTime createdDate;

		public OrganizationDto() {
			super();
			// TODO Auto-generated constructor stub
		}

		public OrganizationDto(Long id, String organizationName, String organizationDescription,
				String organizationCode, LocalDateTime createdDate) {
			super();
			this.id = id;
			this.organizationName = organizationName;
			this.organizationDescription = organizationDescription;
			this.organizationCode = organizationCode;
			this.createdDate = createdDate;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getOrganizationName() {
			return organizationName;
		}

		public void setOrganizationName(String organizationName) {
			this.organizationName = organizationName;
		}

		public String getOrganizationDescription() {
			return organizationDescription;
		}

		public void setOrganizationDescription(String organizationDescription) {
			this.organizationDescription = organizationDescription;
		}

		public String getOrganizationCode() {
			return organizationCode;
		}

		public void setOrganizationCode(String organizationCode) {
			this.organizationCode = organizationCode;
		}

		public LocalDateTime getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(LocalDateTime createdDate) {
			this.createdDate = createdDate;
		}
	    

	

}
