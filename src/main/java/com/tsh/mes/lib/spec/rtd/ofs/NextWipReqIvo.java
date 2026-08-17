package com.tsh.mes.lib.spec.rtd.ofs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tsh.mes.lib.spec.rtd.RtdSystemMessageList;
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
public class NextWipReqIvo extends ApMessage {

	public static final RtdSystemMessageList eventNm = RtdSystemMessageList.NEXT_WIP_REQ;

	@Valid
	@NotNull(message = "body는 필수값입니다.")
	private NextWipReqIvo.Body body;

	@Data
	@SuperBuilder
	@NoArgsConstructor
	@ToString(callSuper = true)
	@EqualsAndHashCode(callSuper = true)
	public static class Body extends ApMessageBody {

		@NotNull(message = "필수값 누락")
		@JsonInclude(JsonInclude.Include.ALWAYS)
		private String lotId;

		@NotNull(message = "필수값 누락")
		private String carrId;

	}

}
