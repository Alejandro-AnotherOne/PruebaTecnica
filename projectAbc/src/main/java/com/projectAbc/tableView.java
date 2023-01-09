package com.projectAbc;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import com.ProyectowebAbc.dao.ProviderDao;
import com.ProyectowebAbc.model.Provider;

@SuppressWarnings("deprecation")
@ManagedBean(name = "tableView")
@RequestScoped
public class tableView {

	private String id;
	private String name;
	
	private Provider selectProvidersC;

	private ProviderDao providerDao = new ProviderDao ();

	private List<Provider> providers;

	private Provider selectedProviders;

	public tableView() {
		selectProvidersC = new Provider();
		selectedProviders = new Provider();
		providers = new ArrayList<>();
       
		providers = providerDao.searchAllProviders();

	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the providers
	 */
	public List<Provider> getProviders() {
		return providers;
	}


	/**
	 * @param providers the providers to set
	 */
	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}


	/**
	 * @return the selectedProviders
	 */
	public Provider getSelectedProviders() {
		return selectedProviders;
	}


	/**
	 * @param selectedProviders the selectedProviders to set
	 */
	public void setSelectedProviders(Provider selectedProviders) {
		System.out.println(selectedProviders.toString());
		this.selectedProviders = selectedProviders;
	}

	public void deleteProviders() {
		providerDao.deleteProvider(selectedProviders);
		providers = providerDao.searchAllProviders();
	}

	public void updateProviders() {
		providerDao.updateProviders(selectedProviders);
		providers = providerDao.searchAllProviders();

	}

	public void createProviders() {
		providerDao.createProviders(selectProvidersC);
		providers = providerDao.searchAllProviders();
	}
	
	public void searchProviders() {
		providers = providerDao.searchProviders(id, name);

	}


	/**
	 * @return the selectProvidersC
	 */
	public Provider getSelectProvidersC() {
		return selectProvidersC;
	}


	/**
	 * @param selectProvidersC the selectProvidersC to set
	 */
	public void setSelectProvidersC(Provider selectProvidersC) {
		this.selectProvidersC = selectProvidersC;
	}
	

}