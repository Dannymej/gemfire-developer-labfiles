package io.pivotal.bookshop.dao;

import java.util.List;

import org.apache.geode.cache.Region;
import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.query.SelectResults;

import io.pivotal.bookshop.domain.BookMaster;

public class BookMasterDAO extends DAOCommon<Integer, BookMaster> {
	// Note that there is a generic region now defined in the DAOCommon class that you can use called 'region'.
	// Notice also that type type (key and value) are defined by the types specified above

	public BookMasterDAO(ClientCache cache) {
		super(cache, "BookMaster");
	}

	/**
	 * Perform a equi-join query that will identify books in BookMaster region having an inventory
	 * balance of < 2 items using InventoryItem objects.
	 * 
	 * @return List of BookMaster having quantityInStock < 2
	 */
	public List<BookMaster> findLowQuantityBooks() {
		// TODO-06: Implement a join query to only select books from BookMaster
		// where the associated InventoryItem quantityInStock is below 2
		String queryString1 = "";
		return null;
	}

}