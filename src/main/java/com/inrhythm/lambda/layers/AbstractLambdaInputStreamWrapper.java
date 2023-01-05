package com.inrhythm.lambda.layers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.io.InputStream;

public abstract class AbstractLambdaInputStreamWrapper <I, O> implements RequestHandler<InputStream, Boolean> {
	public abstract Boolean handleRequest(InputStream streamIn, Context context);
}
