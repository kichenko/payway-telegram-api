package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

import com.payway.telegram.api.tl.schema.methods.*;

public class TLApiRequester {

private RequestExecutor executor;
private TLContext context;

public TLApiRequester(RequestExecutor executor, TLContext context) {
this.executor = executor;
this.context = context;
}

protected <T extends TLObject> T doRpcCall(TLMethod<T> method) throws IOException {
return method.deserializeResponse(executor.doRpcCall(method.serialize()), context);
}
public TLObject InvokeAfterMsg(long msgId, TLMethod query) throws IOException {
return doRpcCall(new TLInvokeAfterMsgMethod(msgId, query));
}

public TLObject InvokeAfterMsgs(com.payway.telegram.api.tl.core.TLLongVector msgIds, TLMethod query) throws IOException {
return doRpcCall(new TLInvokeAfterMsgsMethod(msgIds, query));
}

public com.payway.telegram.api.tl.schema.auth.TLCheckedPhone AuthCheckPhone(String phoneNumber) throws IOException {
return doRpcCall(new TLAuthCheckPhoneMethod(phoneNumber));
}

public com.payway.telegram.api.tl.schema.auth.TLAbstractSentCode AuthSendCode(String phoneNumber, int smsType, int apiId, String apiHash, String langCode) throws IOException {
return doRpcCall(new TLAuthSendCodeMethod(phoneNumber, smsType, apiId, apiHash, langCode));
}

public TLBool AuthSendCall(String phoneNumber, String phoneCodeHash) throws IOException {
return doRpcCall(new TLAuthSendCallMethod(phoneNumber, phoneCodeHash));
}

public com.payway.telegram.api.tl.schema.auth.TLAuthorization AuthSignUp(String phoneNumber, String phoneCodeHash, String phoneCode, String firstName, String lastName) throws IOException {
return doRpcCall(new TLAuthSignUpMethod(phoneNumber, phoneCodeHash, phoneCode, firstName, lastName));
}

public com.payway.telegram.api.tl.schema.auth.TLAuthorization AuthSignIn(String phoneNumber, String phoneCodeHash, String phoneCode) throws IOException {
return doRpcCall(new TLAuthSignInMethod(phoneNumber, phoneCodeHash, phoneCode));
}

public TLBool AuthLogOut() throws IOException {
return doRpcCall(new TLAuthLogOutMethod());
}

public TLBool AuthResetAuthorizations() throws IOException {
return doRpcCall(new TLAuthResetAuthorizationsMethod());
}

public TLBool AuthSendInvites(com.payway.telegram.api.tl.core.TLStringVector phoneNumbers, String message) throws IOException {
return doRpcCall(new TLAuthSendInvitesMethod(phoneNumbers, message));
}

public com.payway.telegram.api.tl.schema.auth.TLExportedAuthorization AuthExportAuthorization(int dcId) throws IOException {
return doRpcCall(new TLAuthExportAuthorizationMethod(dcId));
}

public com.payway.telegram.api.tl.schema.auth.TLAuthorization AuthImportAuthorization(int id, TLBytes bytes) throws IOException {
return doRpcCall(new TLAuthImportAuthorizationMethod(id, bytes));
}

public TLBool AuthBindTempAuthKey(long permAuthKeyId, long nonce, int expiresAt, TLBytes encryptedMessage) throws IOException {
return doRpcCall(new TLAuthBindTempAuthKeyMethod(permAuthKeyId, nonce, expiresAt, encryptedMessage));
}

public TLBool AccountRegisterDevice(int tokenType, String token, String deviceModel, String systemVersion, String appVersion, boolean appSandbox, String langCode) throws IOException {
return doRpcCall(new TLAccountRegisterDeviceMethod(tokenType, token, deviceModel, systemVersion, appVersion, appSandbox, langCode));
}

public TLBool AccountUnregisterDevice(int tokenType, String token) throws IOException {
return doRpcCall(new TLAccountUnregisterDeviceMethod(tokenType, token));
}

public TLBool AccountUpdateNotifySettings(com.payway.telegram.api.tl.schema.TLAbstractInputNotifyPeer peer, com.payway.telegram.api.tl.schema.TLInputPeerNotifySettings settings) throws IOException {
return doRpcCall(new TLAccountUpdateNotifySettingsMethod(peer, settings));
}

public com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings AccountGetNotifySettings(com.payway.telegram.api.tl.schema.TLAbstractInputNotifyPeer peer) throws IOException {
return doRpcCall(new TLAccountGetNotifySettingsMethod(peer));
}

public TLBool AccountResetNotifySettings() throws IOException {
return doRpcCall(new TLAccountResetNotifySettingsMethod());
}

public com.payway.telegram.api.tl.schema.TLAbstractUser AccountUpdateProfile(String firstName, String lastName) throws IOException {
return doRpcCall(new TLAccountUpdateProfileMethod(firstName, lastName));
}

public TLBool AccountUpdateStatus(boolean offline) throws IOException {
return doRpcCall(new TLAccountUpdateStatusMethod(offline));
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractWallPaper> AccountGetWallPapers() throws IOException {
return doRpcCall(new TLAccountGetWallPapersMethod());
}

public TLBool AccountReportPeer(com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, com.payway.telegram.api.tl.schema.TLAbstractReportReason reason) throws IOException {
return doRpcCall(new TLAccountReportPeerMethod(peer, reason));
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> UsersGetUsers(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputUser> id) throws IOException {
return doRpcCall(new TLUsersGetUsersMethod(id));
}

public com.payway.telegram.api.tl.schema.TLUserFull UsersGetFullUser(com.payway.telegram.api.tl.schema.TLAbstractInputUser id) throws IOException {
return doRpcCall(new TLUsersGetFullUserMethod(id));
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContactStatus> ContactsGetStatuses() throws IOException {
return doRpcCall(new TLContactsGetStatusesMethod());
}

public com.payway.telegram.api.tl.schema.contacts.TLAbstractContacts ContactsGetContacts(String hash) throws IOException {
return doRpcCall(new TLContactsGetContactsMethod(hash));
}

public com.payway.telegram.api.tl.schema.contacts.TLImportedContacts ContactsImportContacts(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLInputContact> contacts, boolean replace) throws IOException {
return doRpcCall(new TLContactsImportContactsMethod(contacts, replace));
}

public com.payway.telegram.api.tl.schema.contacts.TLSuggested ContactsGetSuggested(int limit) throws IOException {
return doRpcCall(new TLContactsGetSuggestedMethod(limit));
}

public com.payway.telegram.api.tl.schema.contacts.TLLink ContactsDeleteContact(com.payway.telegram.api.tl.schema.TLAbstractInputUser id) throws IOException {
return doRpcCall(new TLContactsDeleteContactMethod(id));
}

public TLBool ContactsDeleteContacts(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputUser> id) throws IOException {
return doRpcCall(new TLContactsDeleteContactsMethod(id));
}

public TLBool ContactsBlock(com.payway.telegram.api.tl.schema.TLAbstractInputUser id) throws IOException {
return doRpcCall(new TLContactsBlockMethod(id));
}

public TLBool ContactsUnblock(com.payway.telegram.api.tl.schema.TLAbstractInputUser id) throws IOException {
return doRpcCall(new TLContactsUnblockMethod(id));
}

public com.payway.telegram.api.tl.schema.contacts.TLAbstractBlocked ContactsGetBlocked(int offset, int limit) throws IOException {
return doRpcCall(new TLContactsGetBlockedMethod(offset, limit));
}

public com.payway.telegram.api.tl.core.TLIntVector ContactsExportCard() throws IOException {
return doRpcCall(new TLContactsExportCardMethod());
}

public com.payway.telegram.api.tl.schema.TLAbstractUser ContactsImportCard(com.payway.telegram.api.tl.core.TLIntVector exportCard) throws IOException {
return doRpcCall(new TLContactsImportCardMethod(exportCard));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractMessages MessagesGetMessages(com.payway.telegram.api.tl.core.TLIntVector id) throws IOException {
return doRpcCall(new TLMessagesGetMessagesMethod(id));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractDialogs MessagesGetDialogs(int offset, int maxId, int limit) throws IOException {
return doRpcCall(new TLMessagesGetDialogsMethod(offset, maxId, limit));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractMessages MessagesGetHistory(com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, int offset, int maxId, int limit) throws IOException {
return doRpcCall(new TLMessagesGetHistoryMethod(peer, offset, maxId, limit));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractMessages MessagesSearch(com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, String q, com.payway.telegram.api.tl.schema.TLAbstractMessagesFilter filter, int minDate, int maxDate, int offset, int maxId, int limit) throws IOException {
return doRpcCall(new TLMessagesSearchMethod(peer, q, filter, minDate, maxDate, offset, maxId, limit));
}

public com.payway.telegram.api.tl.schema.messages.TLAffectedHistory MessagesReadHistory(com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, int maxId, int offset, boolean readContents) throws IOException {
return doRpcCall(new TLMessagesReadHistoryMethod(peer, maxId, offset, readContents));
}

public com.payway.telegram.api.tl.schema.messages.TLAffectedHistory MessagesDeleteHistory(com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, int offset) throws IOException {
return doRpcCall(new TLMessagesDeleteHistoryMethod(peer, offset));
}

public com.payway.telegram.api.tl.core.TLIntVector MessagesDeleteMessages(com.payway.telegram.api.tl.core.TLIntVector id) throws IOException {
return doRpcCall(new TLMessagesDeleteMessagesMethod(id));
}

public com.payway.telegram.api.tl.core.TLIntVector MessagesReceivedMessages(int maxId) throws IOException {
return doRpcCall(new TLMessagesReceivedMessagesMethod(maxId));
}

public TLBool MessagesSetTyping(com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, com.payway.telegram.api.tl.schema.TLAbstractSendMessageAction action) throws IOException {
return doRpcCall(new TLMessagesSetTypingMethod(peer, action));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractSentMessage MessagesSendMessage(com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, String message, long randomId) throws IOException {
return doRpcCall(new TLMessagesSendMessageMethod(peer, message, randomId));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage MessagesSendMedia(com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, com.payway.telegram.api.tl.schema.TLAbstractInputMedia media, long randomId) throws IOException {
return doRpcCall(new TLMessagesSendMediaMethod(peer, media, randomId));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessages MessagesForwardMessages(com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, com.payway.telegram.api.tl.core.TLIntVector id) throws IOException {
return doRpcCall(new TLMessagesForwardMessagesMethod(peer, id));
}

public TLBool MessagesReportSpam(com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer) throws IOException {
return doRpcCall(new TLMessagesReportSpamMethod(peer));
}

public com.payway.telegram.api.tl.schema.messages.TLChats MessagesGetChats(com.payway.telegram.api.tl.core.TLIntVector id) throws IOException {
return doRpcCall(new TLMessagesGetChatsMethod(id));
}

public com.payway.telegram.api.tl.schema.messages.TLChatFull MessagesGetFullChat(int chatId) throws IOException {
return doRpcCall(new TLMessagesGetFullChatMethod(chatId));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage MessagesEditChatTitle(int chatId, String title) throws IOException {
return doRpcCall(new TLMessagesEditChatTitleMethod(chatId, title));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage MessagesEditChatPhoto(int chatId, com.payway.telegram.api.tl.schema.TLAbstractInputChatPhoto photo) throws IOException {
return doRpcCall(new TLMessagesEditChatPhotoMethod(chatId, photo));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage MessagesAddChatUser(int chatId, com.payway.telegram.api.tl.schema.TLAbstractInputUser userId, int fwdLimit) throws IOException {
return doRpcCall(new TLMessagesAddChatUserMethod(chatId, userId, fwdLimit));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage MessagesDeleteChatUser(int chatId, com.payway.telegram.api.tl.schema.TLAbstractInputUser userId) throws IOException {
return doRpcCall(new TLMessagesDeleteChatUserMethod(chatId, userId));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage MessagesCreateChat(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputUser> users, String title) throws IOException {
return doRpcCall(new TLMessagesCreateChatMethod(users, title));
}

public com.payway.telegram.api.tl.schema.updates.TLState UpdatesGetState() throws IOException {
return doRpcCall(new TLUpdatesGetStateMethod());
}

public com.payway.telegram.api.tl.schema.updates.TLAbstractDifference UpdatesGetDifference(int pts, int date, int qts) throws IOException {
return doRpcCall(new TLUpdatesGetDifferenceMethod(pts, date, qts));
}

public com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto PhotosUpdateProfilePhoto(com.payway.telegram.api.tl.schema.TLAbstractInputPhoto id, com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop crop) throws IOException {
return doRpcCall(new TLPhotosUpdateProfilePhotoMethod(id, crop));
}

public com.payway.telegram.api.tl.schema.photos.TLPhoto PhotosUploadProfilePhoto(com.payway.telegram.api.tl.schema.TLAbstractInputFile file, String caption, com.payway.telegram.api.tl.schema.TLAbstractInputGeoPoint geoPoint, com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop crop) throws IOException {
return doRpcCall(new TLPhotosUploadProfilePhotoMethod(file, caption, geoPoint, crop));
}

public com.payway.telegram.api.tl.core.TLLongVector PhotosDeletePhotos(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputPhoto> id) throws IOException {
return doRpcCall(new TLPhotosDeletePhotosMethod(id));
}

public TLBool UploadSaveFilePart(long fileId, int filePart, TLBytes bytes) throws IOException {
return doRpcCall(new TLUploadSaveFilePartMethod(fileId, filePart, bytes));
}

public com.payway.telegram.api.tl.schema.upload.TLFile UploadGetFile(com.payway.telegram.api.tl.schema.TLAbstractInputFileLocation location, int offset, int limit) throws IOException {
return doRpcCall(new TLUploadGetFileMethod(location, offset, limit));
}

public com.payway.telegram.api.tl.schema.TLConfig HelpGetConfig() throws IOException {
return doRpcCall(new TLHelpGetConfigMethod());
}

public com.payway.telegram.api.tl.schema.TLNearestDc HelpGetNearestDc() throws IOException {
return doRpcCall(new TLHelpGetNearestDcMethod());
}

public com.payway.telegram.api.tl.schema.help.TLAbstractAppUpdate HelpGetAppUpdate(String deviceModel, String systemVersion, String appVersion, String langCode) throws IOException {
return doRpcCall(new TLHelpGetAppUpdateMethod(deviceModel, systemVersion, appVersion, langCode));
}

public TLBool HelpSaveAppLog(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLInputAppEvent> events) throws IOException {
return doRpcCall(new TLHelpSaveAppLogMethod(events));
}

public com.payway.telegram.api.tl.schema.help.TLInviteText HelpGetInviteText(String langCode) throws IOException {
return doRpcCall(new TLHelpGetInviteTextMethod(langCode));
}

public com.payway.telegram.api.tl.schema.photos.TLAbstractPhotos PhotosGetUserPhotos(com.payway.telegram.api.tl.schema.TLAbstractInputUser userId, int offset, int maxId, int limit) throws IOException {
return doRpcCall(new TLPhotosGetUserPhotosMethod(userId, offset, maxId, limit));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage MessagesForwardMessage(com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, int id, long randomId) throws IOException {
return doRpcCall(new TLMessagesForwardMessageMethod(peer, id, randomId));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessages MessagesSendBroadcast(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputUser> contacts, String message, com.payway.telegram.api.tl.schema.TLAbstractInputMedia media) throws IOException {
return doRpcCall(new TLMessagesSendBroadcastMethod(contacts, message, media));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractDhConfig MessagesGetDhConfig(int version, int randomLength) throws IOException {
return doRpcCall(new TLMessagesGetDhConfigMethod(version, randomLength));
}

public com.payway.telegram.api.tl.schema.TLAbstractEncryptedChat MessagesRequestEncryption(com.payway.telegram.api.tl.schema.TLAbstractInputUser userId, int randomId, TLBytes gA) throws IOException {
return doRpcCall(new TLMessagesRequestEncryptionMethod(userId, randomId, gA));
}

public com.payway.telegram.api.tl.schema.TLAbstractEncryptedChat MessagesAcceptEncryption(com.payway.telegram.api.tl.schema.TLInputEncryptedChat peer, TLBytes gB, long keyFingerprint) throws IOException {
return doRpcCall(new TLMessagesAcceptEncryptionMethod(peer, gB, keyFingerprint));
}

public TLBool MessagesDiscardEncryption(int chatId) throws IOException {
return doRpcCall(new TLMessagesDiscardEncryptionMethod(chatId));
}

public TLBool MessagesSetEncryptedTyping(com.payway.telegram.api.tl.schema.TLInputEncryptedChat peer, boolean typing) throws IOException {
return doRpcCall(new TLMessagesSetEncryptedTypingMethod(peer, typing));
}

public TLBool MessagesReadEncryptedHistory(com.payway.telegram.api.tl.schema.TLInputEncryptedChat peer, int maxDate) throws IOException {
return doRpcCall(new TLMessagesReadEncryptedHistoryMethod(peer, maxDate));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractSentEncryptedMessage MessagesSendEncrypted(com.payway.telegram.api.tl.schema.TLInputEncryptedChat peer, long randomId, TLBytes data) throws IOException {
return doRpcCall(new TLMessagesSendEncryptedMethod(peer, randomId, data));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractSentEncryptedMessage MessagesSendEncryptedFile(com.payway.telegram.api.tl.schema.TLInputEncryptedChat peer, long randomId, TLBytes data, com.payway.telegram.api.tl.schema.TLAbstractInputEncryptedFile file) throws IOException {
return doRpcCall(new TLMessagesSendEncryptedFileMethod(peer, randomId, data, file));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractSentEncryptedMessage MessagesSendEncryptedService(com.payway.telegram.api.tl.schema.TLInputEncryptedChat peer, long randomId, TLBytes data) throws IOException {
return doRpcCall(new TLMessagesSendEncryptedServiceMethod(peer, randomId, data));
}

public com.payway.telegram.api.tl.core.TLLongVector MessagesReceivedQueue(int maxQts) throws IOException {
return doRpcCall(new TLMessagesReceivedQueueMethod(maxQts));
}

public TLBool UploadSaveBigFilePart(long fileId, int filePart, int fileTotalParts, TLBytes bytes) throws IOException {
return doRpcCall(new TLUploadSaveBigFilePartMethod(fileId, filePart, fileTotalParts, bytes));
}

public TLObject InitConnection(int apiId, String deviceModel, String systemVersion, String appVersion, String langCode, TLMethod query) throws IOException {
return doRpcCall(new TLInitConnectionMethod(apiId, deviceModel, systemVersion, appVersion, langCode, query));
}

public com.payway.telegram.api.tl.schema.help.TLSupport HelpGetSupport() throws IOException {
return doRpcCall(new TLHelpGetSupportMethod());
}

public TLBool AuthSendSms(String phoneNumber, String phoneCodeHash) throws IOException {
return doRpcCall(new TLAuthSendSmsMethod(phoneNumber, phoneCodeHash));
}

public com.payway.telegram.api.tl.core.TLIntVector MessagesReadMessageContents(com.payway.telegram.api.tl.core.TLIntVector id) throws IOException {
return doRpcCall(new TLMessagesReadMessageContentsMethod(id));
}

public TLBool AccountCheckUsername(String username) throws IOException {
return doRpcCall(new TLAccountCheckUsernameMethod(username));
}

public com.payway.telegram.api.tl.schema.TLAbstractUser AccountUpdateUsername(String username) throws IOException {
return doRpcCall(new TLAccountUpdateUsernameMethod(username));
}

public com.payway.telegram.api.tl.schema.contacts.TLFound ContactsSearch(String q, int limit) throws IOException {
return doRpcCall(new TLContactsSearchMethod(q, limit));
}

public com.payway.telegram.api.tl.schema.account.TLPrivacyRules AccountGetPrivacy(com.payway.telegram.api.tl.schema.TLInputPrivacyKey key) throws IOException {
return doRpcCall(new TLAccountGetPrivacyMethod(key));
}

public com.payway.telegram.api.tl.schema.account.TLPrivacyRules AccountSetPrivacy(com.payway.telegram.api.tl.schema.TLInputPrivacyKey key, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputPrivacyRule> rules) throws IOException {
return doRpcCall(new TLAccountSetPrivacyMethod(key, rules));
}

public TLBool AccountDeleteAccount(String reason) throws IOException {
return doRpcCall(new TLAccountDeleteAccountMethod(reason));
}

public com.payway.telegram.api.tl.schema.TLAccountDaysTTL AccountGetAccountTTL() throws IOException {
return doRpcCall(new TLAccountGetAccountTTLMethod());
}

public TLBool AccountSetAccountTTL(com.payway.telegram.api.tl.schema.TLAccountDaysTTL ttl) throws IOException {
return doRpcCall(new TLAccountSetAccountTTLMethod(ttl));
}

public TLObject InvokeWithLayer(int layer, TLMethod query) throws IOException {
return doRpcCall(new TLInvokeWithLayerMethod(layer, query));
}

public com.payway.telegram.api.tl.schema.TLAbstractUser ContactsResolveUsername(String username) throws IOException {
return doRpcCall(new TLContactsResolveUsernameMethod(username));
}

public com.payway.telegram.api.tl.schema.account.TLSentChangePhoneCode AccountSendChangePhoneCode(String phoneNumber) throws IOException {
return doRpcCall(new TLAccountSendChangePhoneCodeMethod(phoneNumber));
}

public com.payway.telegram.api.tl.schema.TLAbstractUser AccountChangePhone(String phoneNumber, String phoneCodeHash, String phoneCode) throws IOException {
return doRpcCall(new TLAccountChangePhoneMethod(phoneNumber, phoneCodeHash, phoneCode));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractStickers MessagesGetStickers(String emoticon, String hash) throws IOException {
return doRpcCall(new TLMessagesGetStickersMethod(emoticon, hash));
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractAllStickers MessagesGetAllStickers(String hash) throws IOException {
return doRpcCall(new TLMessagesGetAllStickersMethod(hash));
}

public TLBool AccountUpdateDeviceLocked(int period) throws IOException {
return doRpcCall(new TLAccountUpdateDeviceLockedMethod(period));
}



}
