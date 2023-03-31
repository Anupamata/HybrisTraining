/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 27, 2023, 4:43:32 PM                    ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.PITUserAddress;

/**
 * Generated class for type {@link org.training.core.jalo.PITUsers PITUsers}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedPITUsers extends GenericItem
{
	/** Qualifier of the <code>PITUsers.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>PITUsers.pitId</code> attribute **/
	public static final String PITID = "pitId";
	/** Qualifier of the <code>PITUsers.username</code> attribute **/
	public static final String USERNAME = "username";
	/** Qualifier of the <code>PITUsers.password</code> attribute **/
	public static final String PASSWORD = "password";
	/** Qualifier of the <code>PITUsers.designation</code> attribute **/
	public static final String DESIGNATION = "designation";
	/** Qualifier of the <code>PITUsers.addresses</code> attribute **/
	public static final String ADDRESSES = "addresses";
	/**
	* {@link OneToManyHandler} for handling 1:n ADDRESSES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PITUserAddress> ADDRESSESHANDLER = new OneToManyHandler<PITUserAddress>(
	TrainingCoreConstants.TC.PITUSERADDRESS,
	true,
	"user",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(PITID, AttributeMode.INITIAL);
		tmp.put(USERNAME, AttributeMode.INITIAL);
		tmp.put(PASSWORD, AttributeMode.INITIAL);
		tmp.put(DESIGNATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUsers.addresses</code> attribute.
	 * @return the addresses
	 */
	public Collection<PITUserAddress> getAddresses(final SessionContext ctx)
	{
		return ADDRESSESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUsers.addresses</code> attribute.
	 * @return the addresses
	 */
	public Collection<PITUserAddress> getAddresses()
	{
		return getAddresses( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUsers.addresses</code> attribute. 
	 * @param value the addresses
	 */
	public void setAddresses(final SessionContext ctx, final Collection<PITUserAddress> value)
	{
		ADDRESSESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUsers.addresses</code> attribute. 
	 * @param value the addresses
	 */
	public void setAddresses(final Collection<PITUserAddress> value)
	{
		setAddresses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to addresses. 
	 * @param value the item to add to addresses
	 */
	public void addToAddresses(final SessionContext ctx, final PITUserAddress value)
	{
		ADDRESSESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to addresses. 
	 * @param value the item to add to addresses
	 */
	public void addToAddresses(final PITUserAddress value)
	{
		addToAddresses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from addresses. 
	 * @param value the item to remove from addresses
	 */
	public void removeFromAddresses(final SessionContext ctx, final PITUserAddress value)
	{
		ADDRESSESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from addresses. 
	 * @param value the item to remove from addresses
	 */
	public void removeFromAddresses(final PITUserAddress value)
	{
		removeFromAddresses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUsers.designation</code> attribute.
	 * @return the designation - designation of the user.
	 */
	public String getDesignation(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITUsers.getDesignation requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESIGNATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUsers.designation</code> attribute.
	 * @return the designation - designation of the user.
	 */
	public String getDesignation()
	{
		return getDesignation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUsers.designation</code> attribute. 
	 * @return the localized designation - designation of the user.
	 */
	public Map<Language,String> getAllDesignation(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESIGNATION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUsers.designation</code> attribute. 
	 * @return the localized designation - designation of the user.
	 */
	public Map<Language,String> getAllDesignation()
	{
		return getAllDesignation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUsers.designation</code> attribute. 
	 * @param value the designation - designation of the user.
	 */
	public void setDesignation(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITUsers.setDesignation requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESIGNATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUsers.designation</code> attribute. 
	 * @param value the designation - designation of the user.
	 */
	public void setDesignation(final String value)
	{
		setDesignation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUsers.designation</code> attribute. 
	 * @param value the designation - designation of the user.
	 */
	public void setAllDesignation(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESIGNATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUsers.designation</code> attribute. 
	 * @param value the designation - designation of the user.
	 */
	public void setAllDesignation(final Map<Language,String> value)
	{
		setAllDesignation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUsers.name</code> attribute.
	 * @return the name - Name of the user.
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUsers.name</code> attribute.
	 * @return the name - Name of the user.
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUsers.name</code> attribute. 
	 * @param value the name - Name of the user.
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUsers.name</code> attribute. 
	 * @param value the name - Name of the user.
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUsers.password</code> attribute.
	 * @return the password - Password of the user.
	 */
	public String getPassword(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PASSWORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUsers.password</code> attribute.
	 * @return the password - Password of the user.
	 */
	public String getPassword()
	{
		return getPassword( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUsers.password</code> attribute. 
	 * @param value the password - Password of the user.
	 */
	public void setPassword(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PASSWORD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUsers.password</code> attribute. 
	 * @param value the password - Password of the user.
	 */
	public void setPassword(final String value)
	{
		setPassword( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUsers.pitId</code> attribute.
	 * @return the pitId - Id of the user.
	 */
	public Integer getPitId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PITID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUsers.pitId</code> attribute.
	 * @return the pitId - Id of the user.
	 */
	public Integer getPitId()
	{
		return getPitId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUsers.pitId</code> attribute. 
	 * @return the pitId - Id of the user.
	 */
	public int getPitIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPitId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUsers.pitId</code> attribute. 
	 * @return the pitId - Id of the user.
	 */
	public int getPitIdAsPrimitive()
	{
		return getPitIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUsers.pitId</code> attribute. 
	 * @param value the pitId - Id of the user.
	 */
	public void setPitId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PITID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUsers.pitId</code> attribute. 
	 * @param value the pitId - Id of the user.
	 */
	public void setPitId(final Integer value)
	{
		setPitId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUsers.pitId</code> attribute. 
	 * @param value the pitId - Id of the user.
	 */
	public void setPitId(final SessionContext ctx, final int value)
	{
		setPitId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUsers.pitId</code> attribute. 
	 * @param value the pitId - Id of the user.
	 */
	public void setPitId(final int value)
	{
		setPitId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUsers.username</code> attribute.
	 * @return the username - Username of the user.
	 */
	public String getUsername(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUsers.username</code> attribute.
	 * @return the username - Username of the user.
	 */
	public String getUsername()
	{
		return getUsername( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUsers.username</code> attribute. 
	 * @param value the username - Username of the user.
	 */
	public void setUsername(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUsers.username</code> attribute. 
	 * @param value the username - Username of the user.
	 */
	public void setUsername(final String value)
	{
		setUsername( getSession().getSessionContext(), value );
	}
	
}
