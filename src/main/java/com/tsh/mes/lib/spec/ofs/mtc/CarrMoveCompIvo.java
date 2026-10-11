package com.tsh.mes.lib.spec.ofs.mtc;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tsh.mes.lib.spec.ofs.OfsSystemMessageList;
import com.tsh.starter.befw.lib.core.ApMessage;
import com.tsh.starter.befw.lib.core.spec.ApMessageBody;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CarrMoveCompIvo extends ApMessage {

	public static final OfsSystemMessageList eventNm = OfsSystemMessageList.CARR_MOVE_COMP;

	@Valid
	@NotNull(message = "body는 필수값입니다.")
	private CarrMoveCompIvo.Body body;

	@Data
	@SuperBuilder
	@NoArgsConstructor
	@ToString(callSuper = true)
	@EqualsAndHashCode(callSuper = true)
	public static class Body extends ApMessageBody {

		@NotNull(message = "필수값 누락")
		@JsonInclude(JsonInclude.Include.ALWAYS)
		private String carrId;

		@NotNull(message = "필수값 누락")
		private String jobId;

		@NotNull(message = "필수값 누락")
		private String eqpId;

		@NotNull(message = "필수값 누락")
		private String portId;

	}

}
