package com.intershop.adapter.payment.partnerpay.capi.service.authorize;

import com.intershop.api.service.payment.v1.capability.Authorize;

/**
 * Describes a factory responsible for the creation of an authorize capability. 
 */
@FunctionalInterface
public interface AuthorizeFactory
{
    /**
     * Creates an instance of the authorize capability.
     */
    public Authorize createAuthorize();
}
