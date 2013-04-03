/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class FilmText extends org.jooq.impl.TableImpl<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord> {

	private static final long serialVersionUID = -452830212;

	/**
	 * The singleton instance of <code>sakila.film_text</code>
	 */
	public static final org.jooq.examples.mysql.sakila.tables.FilmText FILM_TEXT = new org.jooq.examples.mysql.sakila.tables.FilmText();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord.class;
	}

	/**
	 * The column <code>sakila.film_text.film_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord, java.lang.Short> FILM_ID = createField("film_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>sakila.film_text.title</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>sakila.film_text.description</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * Create a <code>sakila.film_text</code> table reference
	 */
	public FilmText() {
		super("film_text", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	/**
	 * Create an aliased <code>sakila.film_text</code> table reference
	 */
	public FilmText(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.FilmText.FILM_TEXT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord> getPrimaryKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_FILM_TEXT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_FILM_TEXT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.mysql.sakila.tables.FilmText as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.FilmText(alias);
	}
}
