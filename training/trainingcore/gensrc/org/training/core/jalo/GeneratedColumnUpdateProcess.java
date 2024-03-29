/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 27, 2023, 4:43:32 PM                    ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.PITUsers;

/**
 * Generated class for type {@link de.hybris.platform.processengine.jalo.BusinessProcess ColumnUpdateProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedColumnUpdateProcess extends BusinessProcess
{
	/** Qualifier of the <code>ColumnUpdateProcess.pitUser</code> attribute **/
	public static final String PITUSER = "pitUser";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BusinessProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PITUSER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ColumnUpdateProcess.pitUser</code> attribute.
	 * @return the pitUser - PitUser attribute that will be used in the process.
	 */
	public PITUsers getPitUser(final SessionContext ctx)
	{
		return (PITUsers)getProperty( ctx, PITUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ColumnUpdateProcess.pitUser</code> attribute.
	 * @return the pitUser - PitUser attribute that will be used in the process.
	 */
	public PITUsers getPitUser()
	{
		return getPitUser( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ColumnUpdateProcess.pitUser</code> attribute. 
	 * @param value the pitUser - PitUser attribute that will be used in the process.
	 */
	public void setPitUser(final SessionContext ctx, final PITUsers value)
	{
		setProperty(ctx, PITUSER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ColumnUpdateProcess.pitUser</code> attribute. 
	 * @param value the pitUser - PitUser attribute that will be used in the process.
	 */
	public void setPitUser(final PITUsers value)
	{
		setPitUser( getSession().getSessionContext(), value );
	}
	
}
