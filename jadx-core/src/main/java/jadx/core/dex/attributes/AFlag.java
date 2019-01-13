package jadx.core.dex.attributes;

public enum AFlag {
	TRY_ENTER,
	TRY_LEAVE,

	LOOP_START,
	LOOP_END,

	SYNTHETIC,
	FINAL, // SSAVar attribute for make var final

	RETURN, // block contains only return instruction
	ORIG_RETURN,

	DECLARE_VAR,
	DONT_WRAP,

	DONT_INLINE,
	DONT_GENERATE, // process as usual, but don't output to generated code
	REMOVE, // can be completely removed
	ADDED_TO_REGION,

	SKIP_FIRST_ARG,
	SKIP_ARG, // skip argument in invoke call
	ANONYMOUS_CONSTRUCTOR,
	ANONYMOUS_CLASS,
	THIS,
	METHOD_ARGUMENT, // RegisterArg attribute for method arguments
	CUSTOM_DECLARE, // variable for this register don't need declaration

	ELSE_IF_CHAIN,

	WRAPPED,
	ARITH_ONEARG,

	FALL_THROUGH,

	INCONSISTENT_CODE, // warning about incorrect decompilation
}
