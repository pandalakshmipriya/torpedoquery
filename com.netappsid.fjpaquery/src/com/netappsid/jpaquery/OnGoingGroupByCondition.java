package com.netappsid.jpaquery;

import java.util.Collection;

public interface OnGoingGroupByCondition {

	public <T> OnGoingCondition<T> having(T object);

	public <T extends Number> OnGoingNumberCondition<T> having(T object);

	public OnGoingStringCondition<String> having(String object);

	public <T> OnGoingCollectionCondition<T> having(Collection<T> object);

}
