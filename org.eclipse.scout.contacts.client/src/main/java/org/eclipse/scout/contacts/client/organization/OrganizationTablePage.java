package org.eclipse.scout.contacts.client.organization;

import org.eclipse.scout.contacts.client.organization.OrganizationTablePage.Table;
import org.eclipse.scout.contacts.shared.organization.IOrganizationService;
import org.eclipse.scout.contacts.shared.organization.OrganizationTablePageData;
import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@Data(OrganizationTablePageData.class)
public class OrganizationTablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Organizations");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IOrganizationService.class).getOrganizationTableData(filter));
	}

	public class Table extends AbstractTable {

		public OrganizationIdColumn getOrganizationIdColumn() {
			return getColumnSet().getColumnByClass(OrganizationIdColumn.class);
		}

		public NameColumn getNameColumn() {
			return getColumnSet().getColumnByClass(NameColumn.class);
		}

		public CountryColumn getCountryColumn() {
			return getColumnSet().getColumnByClass(CountryColumn.class);
		}

		public CityColumn getCityColumn() {
			return getColumnSet().getColumnByClass(CityColumn.class);
		}

		public HomepageColumn getHomepageColumn() {
			return getColumnSet().getColumnByClass(HomepageColumn.class);
		}

		@Order(1)
		public class OrganizationIdColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("MyNlsKey");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override 
		    protected boolean getConfiguredDisplayable() {
				return false;
		    }

			@Override 
			protected boolean getConfiguredPrimaryKey() {
		        return true;
		    }
		}

		@Order(2)
		public class NameColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Name");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(3)
		public class CityColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("City");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}
		
		

		@Order(4)
		public class CountryColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Country");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(5)
		public class HomepageColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Homepage");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}
		
		
		
		
		
		
	}
}
