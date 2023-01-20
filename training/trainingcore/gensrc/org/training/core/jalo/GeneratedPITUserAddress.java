/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jan 16, 2023, 11:46:43 AM                   ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.PITUsers;

/**
 * Generated class for type {@link org.training.core.jalo.PITUserAddress PITUserAddress}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedPITUserAddress extends GenericItem
{
	/** Qualifier of the <code>PITUserAddress.addressId</code> attribute **/
	public static final String ADDRESSID = "addressId";
	/** Qualifier of the <code>PITUserAddress.houseName</code> attribute **/
	public static final String HOUSENAME = "houseName";
	/** Qualifier of the <code>PITUserAddress.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>PITUserAddress.state</code> attribute **/
	public static final String STATE = "state";
	/** Qualifier of the <code>PITUserAddress.pin</code> attribute **/
	public static final String PIN = "pin";
	/** Qualifier of the <code>PITUserAddress.user</code> attribute **/
	public static final String USER = "user";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n USER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPITUserAddress> USERHANDLER = new BidirectionalOneToManyHandler<GeneratedPITUserAddress>(
	TrainingCoreConstants.TC.PITUSERADDRESS,
	false,
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
		tmp.put(ADDRESSID, AttributeMode.INITIAL);
		tmp.put(HOUSENAME, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(STATE, AttributeMode.INITIAL);
		tmp.put(PIN, AttributeMode.INITIAL);
		tmp.put(USER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.addressId</code> attribute.
	 * @return the addressId - Unique ID of the Address.
	 */
	public Integer getAddressId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ADDRESSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.addressId</code> attribute.
	 * @return the addressId - Unique ID of the Address.
	 */
	public Integer getAddressId()
	{
		return getAddressId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.addressId</code> attribute. 
	 * @return the addressId - Unique ID of the Address.
	 */
	public int getAddressIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAddressId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.addressId</code> attribute. 
	 * @return the addressId - Unique ID of the Address.
	 */
	public int getAddressIdAsPrimitive()
	{
		return getAddressIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.addressId</code> attribute. 
	 * @param value the addressId - Unique ID of the Address.
	 */
	public void setAddressId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ADDRESSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.addressId</code> attribute. 
	 * @param value the addressId - Unique ID of the Address.
	 */
	public void setAddressId(final Integer value)
	{
		setAddressId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.addressId</code> attribute. 
	 * @param value the addressId - Unique ID of the Address.
	 */
	public void setAddressId(final SessionContext ctx, final int value)
	{
		setAddressId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.addressId</code> attribute. 
	 * @param value the addressId - Unique ID of the Address.
	 */
	public void setAddressId(final int value)
	{
		setAddressId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.city</code> attribute.
	 * @return the city - City of the user.
	 */
	public String getCity(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITUserAddress.getCity requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.city</code> attribute.
	 * @return the city - City of the user.
	 */
	public String getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.city</code> attribute. 
	 * @return the localized city - City of the user.
	 */
	public Map<Language,String> getAllCity(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,CITY,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.city</code> attribute. 
	 * @return the localized city - City of the user.
	 */
	public Map<Language,String> getAllCity()
	{
		return getAllCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.city</code> attribute. 
	 * @param value the city - City of the user.
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITUserAddress.setCity requires a session language", 0 );
		}
		setLocalizedProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.city</code> attribute. 
	 * @param value the city - City of the user.
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.city</code> attribute. 
	 * @param value the city - City of the user.
	 */
	public void setAllCity(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.city</code> attribute. 
	 * @param value the city - City of the user.
	 */
	public void setAllCity(final Map<Language,String> value)
	{
		setAllCity( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		USERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.houseName</code> attribute.
	 * @return the houseName - HouseName of the user.
	 */
	public String getHouseName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITUserAddress.getHouseName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, HOUSENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.houseName</code> attribute.
	 * @return the houseName - HouseName of the user.
	 */
	public String getHouseName()
	{
		return getHouseName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.houseName</code> attribute. 
	 * @return the localized houseName - HouseName of the user.
	 */
	public Map<Language,String> getAllHouseName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,HOUSENAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.houseName</code> attribute. 
	 * @return the localized houseName - HouseName of the user.
	 */
	public Map<Language,String> getAllHouseName()
	{
		return getAllHouseName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.houseName</code> attribute. 
	 * @param value the houseName - HouseName of the user.
	 */
	public void setHouseName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITUserAddress.setHouseName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, HOUSENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.houseName</code> attribute. 
	 * @param value the houseName - HouseName of the user.
	 */
	public void setHouseName(final String value)
	{
		setHouseName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.houseName</code> attribute. 
	 * @param value the houseName - HouseName of the user.
	 */
	public void setAllHouseName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,HOUSENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.houseName</code> attribute. 
	 * @param value the houseName - HouseName of the user.
	 */
	public void setAllHouseName(final Map<Language,String> value)
	{
		setAllHouseName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.pin</code> attribute.
	 * @return the pin - Pin of the user.
	 */
	public Integer getPin(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.pin</code> attribute.
	 * @return the pin - Pin of the user.
	 */
	public Integer getPin()
	{
		return getPin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.pin</code> attribute. 
	 * @return the pin - Pin of the user.
	 */
	public int getPinAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPin( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.pin</code> attribute. 
	 * @return the pin - Pin of the user.
	 */
	public int getPinAsPrimitive()
	{
		return getPinAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.pin</code> attribute. 
	 * @param value the pin - Pin of the user.
	 */
	public void setPin(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.pin</code> attribute. 
	 * @param value the pin - Pin of the user.
	 */
	public void setPin(final Integer value)
	{
		setPin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.pin</code> attribute. 
	 * @param value the pin - Pin of the user.
	 */
	public void setPin(final SessionContext ctx, final int value)
	{
		setPin( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.pin</code> attribute. 
	 * @param value the pin - Pin of the user.
	 */
	public void setPin(final int value)
	{
		setPin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.state</code> attribute.
	 * @return the state - State of the user.
	 */
	public String getState(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITUserAddress.getState requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, STATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.state</code> attribute.
	 * @return the state - State of the user.
	 */
	public String getState()
	{
		return getState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.state</code> attribute. 
	 * @return the localized state - State of the user.
	 */
	public Map<Language,String> getAllState(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,STATE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.state</code> attribute. 
	 * @return the localized state - State of the user.
	 */
	public Map<Language,String> getAllState()
	{
		return getAllState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.state</code> attribute. 
	 * @param value the state - State of the user.
	 */
	public void setState(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITUserAddress.setState requires a session language", 0 );
		}
		setLocalizedProperty(ctx, STATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.state</code> attribute. 
	 * @param value the state - State of the user.
	 */
	public void setState(final String value)
	{
		setState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.state</code> attribute. 
	 * @param value the state - State of the user.
	 */
	public void setAllState(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,STATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.state</code> attribute. 
	 * @param value the state - State of the user.
	 */
	public void setAllState(final Map<Language,String> value)
	{
		setAllState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.user</code> attribute.
	 * @return the user
	 */
	public PITUsers getUser(final SessionContext ctx)
	{
		return (PITUsers)getProperty( ctx, USER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUserAddress.user</code> attribute.
	 * @return the user
	 */
	public PITUsers getUser()
	{
		return getUser( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.user</code> attribute. 
	 * @param value the user
	 */
	public void setUser(final SessionContext ctx, final PITUsers value)
	{
		USERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUserAddress.user</code> attribute. 
	 * @param value the user
	 */
	public void setUser(final PITUsers value)
	{
		setUser( getSession().getSessionContext(), value );
	}
	
}
