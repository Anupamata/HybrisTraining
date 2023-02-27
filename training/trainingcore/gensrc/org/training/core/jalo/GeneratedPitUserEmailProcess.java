/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 22, 2023, 12:53:00 PM                   ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.PITUsers;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess PitUserEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedPitUserEmailProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>PitUserEmailProcess.pitUser</code> attribute **/
	public static final String PITUSER = "pitUser";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PITUSER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PitUserEmailProcess.pitUser</code> attribute.
	 * @return the pitUser - PitUser attribute that will be used in the process.
	 */
	public PITUsers getPitUser(final SessionContext ctx)
	{
		return (PITUsers)getProperty( ctx, PITUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PitUserEmailProcess.pitUser</code> attribute.
	 * @return the pitUser - PitUser attribute that will be used in the process.
	 */
	public PITUsers getPitUser()
	{
		return getPitUser( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PitUserEmailProcess.pitUser</code> attribute. 
	 * @param value the pitUser - PitUser attribute that will be used in the process.
	 */
	public void setPitUser(final SessionContext ctx, final PITUsers value)
	{
		setProperty(ctx, PITUSER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PitUserEmailProcess.pitUser</code> attribute. 
	 * @param value the pitUser - PitUser attribute that will be used in the process.
	 */
	public void setPitUser(final PITUsers value)
	{
		setPitUser( getSession().getSessionContext(), value );
	}
	
}
