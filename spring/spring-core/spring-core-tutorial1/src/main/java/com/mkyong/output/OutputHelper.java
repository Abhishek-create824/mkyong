package com.mkyong.output;

public class OutputHelper {
	private IOutputGenerator outputGenerator;

	public OutputHelper() {
		super();
	}

	// DI via constructor
	public OutputHelper(IOutputGenerator outputGenerator) {
		this();
		setOutputGenerator(outputGenerator);
	}

	public void generateOutput() {
		outputGenerator.generateOutput();
	}

	// DI via set method
	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
}