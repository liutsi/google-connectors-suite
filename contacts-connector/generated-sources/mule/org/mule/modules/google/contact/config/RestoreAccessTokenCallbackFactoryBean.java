
package org.mule.modules.google.contact.config;

import javax.annotation.Generated;
import org.mule.api.processor.MessageProcessor;
import org.mule.config.spring.factories.MessageProcessorChainFactoryBean;
import org.mule.security.oauth.callback.DefaultRestoreAccessTokenCallback;

@Generated(value = "Mule DevKit Version 3.5.0-SNAPSHOT", date = "2014-02-18T03:27:05-06:00", comments = "Build UNKNOWN_BUILDNUMBER")
public class RestoreAccessTokenCallbackFactoryBean
    extends MessageProcessorChainFactoryBean
{


    public Class getObjectType() {
        return DefaultRestoreAccessTokenCallback.class;
    }

    public Object getObject()
        throws Exception
    {
        DefaultRestoreAccessTokenCallback callback = new DefaultRestoreAccessTokenCallback();
        callback.setMessageProcessor(((MessageProcessor) super.getObject()));
        return callback;
    }

}
