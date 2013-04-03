/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class FilmActor extends org.jooq.impl.TableImpl<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord> {

	private static final long serialVersionUID = -1116702262;

	/**
	 * The singleton instance of <code>sakila.film_actor</code>
	 */
	public static final org.jooq.examples.mysql.sakila.tables.FilmActor FILM_ACTOR = new org.jooq.examples.mysql.sakila.tables.FilmActor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord.class;
	}

	/**
	 * The column <code>sakila.film_actor.actor_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, java.lang.Short> ACTOR_ID = createField("actor_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>sakila.film_actor.film_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, java.lang.Short> FILM_ID = createField("film_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>sakila.film_actor.last_update</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>sakila.film_actor</code> table reference
	 */
	public FilmActor() {
		super("film_actor", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	/**
	 * Create an aliased <code>sakila.film_actor</code> table reference
	 */
	public FilmActor(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord> getPrimaryKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_FILM_ACTOR_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_FILM_ACTOR_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, ?>>asList(org.jooq.examples.mysql.sakila.Keys.FK_FILM_ACTOR_ACTOR, org.jooq.examples.mysql.sakila.Keys.FK_FILM_ACTOR_FILM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.mysql.sakila.tables.FilmActor as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.FilmActor(alias);
	}
}
