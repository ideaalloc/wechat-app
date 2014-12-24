/**
 * This class is generated by jOOQ
 */
package org.checkin.repository.repository;

/**
 * A class modelling foreign key relationships between tables of the <code>checkin</code> 
 * schema
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<org.checkin.repository.repository.tables.records.CheckinPhotoRecord, java.lang.Long> IDENTITY_CHECKIN_PHOTO = Identities0.IDENTITY_CHECKIN_PHOTO;
	public static final org.jooq.Identity<org.checkin.repository.repository.tables.records.FitnessCheckinRecord, java.lang.Long> IDENTITY_FITNESS_CHECKIN = Identities0.IDENTITY_FITNESS_CHECKIN;
	public static final org.jooq.Identity<org.checkin.repository.repository.tables.records.WechatUserRecord, java.lang.Long> IDENTITY_WECHAT_USER = Identities0.IDENTITY_WECHAT_USER;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<org.checkin.repository.repository.tables.records.CheckinPhotoRecord> KEY_CHECKIN_PHOTO_PRIMARY = UniqueKeys0.KEY_CHECKIN_PHOTO_PRIMARY;
	public static final org.jooq.UniqueKey<org.checkin.repository.repository.tables.records.FitnessCheckinRecord> KEY_FITNESS_CHECKIN_PRIMARY = UniqueKeys0.KEY_FITNESS_CHECKIN_PRIMARY;
	public static final org.jooq.UniqueKey<org.checkin.repository.repository.tables.records.WechatUserRecord> KEY_WECHAT_USER_PRIMARY = UniqueKeys0.KEY_WECHAT_USER_PRIMARY;
	public static final org.jooq.UniqueKey<org.checkin.repository.repository.tables.records.WechatUserRecord> KEY_WECHAT_USER_IDX_WECHAT_USER_WECHAT_UID = UniqueKeys0.KEY_WECHAT_USER_IDX_WECHAT_USER_WECHAT_UID;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<org.checkin.repository.repository.tables.records.CheckinPhotoRecord, java.lang.Long> IDENTITY_CHECKIN_PHOTO = createIdentity(org.checkin.repository.repository.tables.CheckinPhoto.CHECKIN_PHOTO, org.checkin.repository.repository.tables.CheckinPhoto.CHECKIN_PHOTO.ID);
		public static org.jooq.Identity<org.checkin.repository.repository.tables.records.FitnessCheckinRecord, java.lang.Long> IDENTITY_FITNESS_CHECKIN = createIdentity(org.checkin.repository.repository.tables.FitnessCheckin.FITNESS_CHECKIN, org.checkin.repository.repository.tables.FitnessCheckin.FITNESS_CHECKIN.ID);
		public static org.jooq.Identity<org.checkin.repository.repository.tables.records.WechatUserRecord, java.lang.Long> IDENTITY_WECHAT_USER = createIdentity(org.checkin.repository.repository.tables.WechatUser.WECHAT_USER, org.checkin.repository.repository.tables.WechatUser.WECHAT_USER.ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<org.checkin.repository.repository.tables.records.CheckinPhotoRecord> KEY_CHECKIN_PHOTO_PRIMARY = createUniqueKey(org.checkin.repository.repository.tables.CheckinPhoto.CHECKIN_PHOTO, org.checkin.repository.repository.tables.CheckinPhoto.CHECKIN_PHOTO.ID);
		public static final org.jooq.UniqueKey<org.checkin.repository.repository.tables.records.FitnessCheckinRecord> KEY_FITNESS_CHECKIN_PRIMARY = createUniqueKey(org.checkin.repository.repository.tables.FitnessCheckin.FITNESS_CHECKIN, org.checkin.repository.repository.tables.FitnessCheckin.FITNESS_CHECKIN.ID);
		public static final org.jooq.UniqueKey<org.checkin.repository.repository.tables.records.WechatUserRecord> KEY_WECHAT_USER_PRIMARY = createUniqueKey(org.checkin.repository.repository.tables.WechatUser.WECHAT_USER, org.checkin.repository.repository.tables.WechatUser.WECHAT_USER.ID);
		public static final org.jooq.UniqueKey<org.checkin.repository.repository.tables.records.WechatUserRecord> KEY_WECHAT_USER_IDX_WECHAT_USER_WECHAT_UID = createUniqueKey(org.checkin.repository.repository.tables.WechatUser.WECHAT_USER, org.checkin.repository.repository.tables.WechatUser.WECHAT_USER.WECHAT_UID);
	}
}