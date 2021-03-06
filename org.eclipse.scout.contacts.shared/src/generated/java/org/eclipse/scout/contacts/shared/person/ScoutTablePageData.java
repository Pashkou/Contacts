package org.eclipse.scout.contacts.shared.person;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications
 * recommended.
 */
@Generated(value = "org.eclipse.scout.contacts.client.person.ScoutTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class ScoutTablePageData extends AbstractTablePageData {

	private static final long serialVersionUID = 1L;

	@Override
	public ScoutTableRowData addRow() {
		return (ScoutTableRowData) super.addRow();
	}

	@Override
	public ScoutTableRowData addRow(int rowState) {
		return (ScoutTableRowData) super.addRow(rowState);
	}

	@Override
	public ScoutTableRowData createRow() {
		return new ScoutTableRowData();
	}

	@Override
	public Class<? extends AbstractTableRowData> getRowType() {
		return ScoutTableRowData.class;
	}

	@Override
	public ScoutTableRowData[] getRows() {
		return (ScoutTableRowData[]) super.getRows();
	}

	@Override
	public ScoutTableRowData rowAt(int index) {
		return (ScoutTableRowData) super.rowAt(index);
	}

	public void setRows(ScoutTableRowData[] rows) {
		super.setRows(rows);
	}

	public static class ScoutTableRowData extends AbstractTableRowData {

		private static final long serialVersionUID = 1L;
	}
}
