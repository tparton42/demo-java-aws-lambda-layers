package com.inrhythm.lambda.layers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Abstract Lambda request handler for DTO Objects
 * I = input object such as a DTO
 * O = outbound object such as a Boolean or DTO
 */
public abstract class AbstractLambdaDTOWrapper<I, O> implements RequestHandler<Object, Object> {

    public abstract Object handleRequest(Object objIn, Context context);
}
