package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLApiContext extends TLContext {

protected void init() {

registerClass(0xd0028438, com.payway.telegram.api.tl.schema.TLImportedContact.class);
registerClass(0x7f3b18ea, com.payway.telegram.api.tl.schema.TLInputPeerEmpty.class);
registerClass(0x7da07ec9, com.payway.telegram.api.tl.schema.TLInputPeerSelf.class);
registerClass(0x1023dbe8, com.payway.telegram.api.tl.schema.TLInputPeerContact.class);
registerClass(0x9b447325, com.payway.telegram.api.tl.schema.TLInputPeerForeign.class);
registerClass(0x179be863, com.payway.telegram.api.tl.schema.TLInputPeerChat.class);
registerClass(0x5508ec75, com.payway.telegram.api.tl.schema.TLInputVideoEmpty.class);
registerClass(0xee579652, com.payway.telegram.api.tl.schema.TLInputVideo.class);
registerClass(0x1cd7bf0d, com.payway.telegram.api.tl.schema.TLInputPhotoEmpty.class);
registerClass(0xfb95c6c4, com.payway.telegram.api.tl.schema.TLInputPhoto.class);
registerClass(0x5d75a138, com.payway.telegram.api.tl.schema.updates.TLDifferenceEmpty.class);
registerClass(0xf49ca0, com.payway.telegram.api.tl.schema.updates.TLDifference.class);
registerClass(0xa8fb1981, com.payway.telegram.api.tl.schema.updates.TLDifferenceSlice.class);
registerClass(0x1ca48f57, com.payway.telegram.api.tl.schema.TLInputChatPhotoEmpty.class);
registerClass(0x94254732, com.payway.telegram.api.tl.schema.TLInputChatUploadedPhoto.class);
registerClass(0xb2e1bf08, com.payway.telegram.api.tl.schema.TLInputChatPhoto.class);
registerClass(0xe86602c3, com.payway.telegram.api.tl.schema.messages.TLAllStickersNotModified.class);
registerClass(0xdcef3102, com.payway.telegram.api.tl.schema.messages.TLAllStickers.class);
registerClass(0x9fd40bd8, com.payway.telegram.api.tl.schema.TLNotifyPeer.class);
registerClass(0xb4c83b4c, com.payway.telegram.api.tl.schema.TLNotifyUsers.class);
registerClass(0xc007cec3, com.payway.telegram.api.tl.schema.TLNotifyChats.class);
registerClass(0x74d07c60, com.payway.telegram.api.tl.schema.TLNotifyAll.class);
registerClass(0x36f8c871, com.payway.telegram.api.tl.schema.TLDocumentEmpty.class);
registerClass(0xf9a39f4f, com.payway.telegram.api.tl.schema.TLDocument.class);
registerClass(0x9d05049, com.payway.telegram.api.tl.schema.TLUserStatusEmpty.class);
registerClass(0xedb93949, com.payway.telegram.api.tl.schema.TLUserStatusOnline.class);
registerClass(0x8c703f, com.payway.telegram.api.tl.schema.TLUserStatusOffline.class);
registerClass(0xe26f42f1, com.payway.telegram.api.tl.schema.TLUserStatusRecently.class);
registerClass(0x7bf09fc, com.payway.telegram.api.tl.schema.TLUserStatusLastWeek.class);
registerClass(0x77ebc742, com.payway.telegram.api.tl.schema.TLUserStatusLastMonth.class);
registerClass(0xd1f4d35c, com.payway.telegram.api.tl.schema.messages.TLSentMessage.class);
registerClass(0xe9db4a3f, com.payway.telegram.api.tl.schema.messages.TLSentMessageLink.class);
registerClass(0x4f96cb18, com.payway.telegram.api.tl.schema.TLInputPrivacyKey.class);
registerClass(0xaa963b05, com.payway.telegram.api.tl.schema.storage.TLFileUnknown.class);
registerClass(0x7efe0e, com.payway.telegram.api.tl.schema.storage.TLFileJpeg.class);
registerClass(0xcae1aadf, com.payway.telegram.api.tl.schema.storage.TLFileGif.class);
registerClass(0xa4f63c0, com.payway.telegram.api.tl.schema.storage.TLFilePng.class);
registerClass(0xae1e508d, com.payway.telegram.api.tl.schema.storage.TLFilePdf.class);
registerClass(0x528a0677, com.payway.telegram.api.tl.schema.storage.TLFileMp3.class);
registerClass(0x4b09ebbc, com.payway.telegram.api.tl.schema.storage.TLFileMov.class);
registerClass(0x40bc6f52, com.payway.telegram.api.tl.schema.storage.TLFilePartial.class);
registerClass(0xb3cea0e4, com.payway.telegram.api.tl.schema.storage.TLFileMp4.class);
registerClass(0x1081464c, com.payway.telegram.api.tl.schema.storage.TLFileWebp.class);
registerClass(0xa56c2a3e, com.payway.telegram.api.tl.schema.updates.TLState.class);
registerClass(0x3ded6320, com.payway.telegram.api.tl.schema.TLMessageMediaEmpty.class);
registerClass(0xc8c45a2a, com.payway.telegram.api.tl.schema.TLMessageMediaPhoto.class);
registerClass(0xa2d24290, com.payway.telegram.api.tl.schema.TLMessageMediaVideo.class);
registerClass(0x56e0d474, com.payway.telegram.api.tl.schema.TLMessageMediaGeo.class);
registerClass(0x5e7d2f39, com.payway.telegram.api.tl.schema.TLMessageMediaContact.class);
registerClass(0x29632a36, com.payway.telegram.api.tl.schema.TLMessageMediaUnsupported.class);
registerClass(0x2fda2204, com.payway.telegram.api.tl.schema.TLMessageMediaDocument.class);
registerClass(0xc6b68300, com.payway.telegram.api.tl.schema.TLMessageMediaAudio.class);
registerClass(0xe4c123d6, com.payway.telegram.api.tl.schema.TLInputGeoPointEmpty.class);
registerClass(0xf3b7acc9, com.payway.telegram.api.tl.schema.TLInputGeoPoint.class);
registerClass(0x4f11bae1, com.payway.telegram.api.tl.schema.TLUserProfilePhotoEmpty.class);
registerClass(0xd559d8c8, com.payway.telegram.api.tl.schema.TLUserProfilePhoto.class);
registerClass(0xdf969c2d, com.payway.telegram.api.tl.schema.auth.TLExportedAuthorization.class);
registerClass(0x70a68512, com.payway.telegram.api.tl.schema.TLPeerNotifySettingsEmpty.class);
registerClass(0x8d5e11ee, com.payway.telegram.api.tl.schema.TLPeerNotifySettings.class);
registerClass(0x133421f8, com.payway.telegram.api.tl.schema.contacts.TLForeignLinkUnknown.class);
registerClass(0xa7801f47, com.payway.telegram.api.tl.schema.contacts.TLForeignLinkRequested.class);
registerClass(0x1bea8ce1, com.payway.telegram.api.tl.schema.contacts.TLForeignLinkMutual.class);
registerClass(0xb8d0afdf, com.payway.telegram.api.tl.schema.TLAccountDaysTTL.class);
registerClass(0x9664f57f, com.payway.telegram.api.tl.schema.TLInputMediaEmpty.class);
registerClass(0x2dc53a7d, com.payway.telegram.api.tl.schema.TLInputMediaUploadedPhoto.class);
registerClass(0x8f2ab2ec, com.payway.telegram.api.tl.schema.TLInputMediaPhoto.class);
registerClass(0xf9c44144, com.payway.telegram.api.tl.schema.TLInputMediaGeoPoint.class);
registerClass(0xa6e45987, com.payway.telegram.api.tl.schema.TLInputMediaContact.class);
registerClass(0x133ad6f6, com.payway.telegram.api.tl.schema.TLInputMediaUploadedVideo.class);
registerClass(0x9912dabf, com.payway.telegram.api.tl.schema.TLInputMediaUploadedThumbVideo.class);
registerClass(0x7f023ae6, com.payway.telegram.api.tl.schema.TLInputMediaVideo.class);
registerClass(0x4e498cab, com.payway.telegram.api.tl.schema.TLInputMediaUploadedAudio.class);
registerClass(0x89938781, com.payway.telegram.api.tl.schema.TLInputMediaAudio.class);
registerClass(0xffe76b78, com.payway.telegram.api.tl.schema.TLInputMediaUploadedDocument.class);
registerClass(0x41481486, com.payway.telegram.api.tl.schema.TLInputMediaUploadedThumbDocument.class);
registerClass(0xd184e841, com.payway.telegram.api.tl.schema.TLInputMediaDocument.class);
registerClass(0x18cb9f78, com.payway.telegram.api.tl.schema.help.TLInviteText.class);
registerClass(0x8dca6aa5, com.payway.telegram.api.tl.schema.photos.TLPhotos.class);
registerClass(0x15051f54, com.payway.telegram.api.tl.schema.photos.TLPhotosSlice.class);
registerClass(0x3de191a1, com.payway.telegram.api.tl.schema.TLContactSuggested.class);
registerClass(0x14637196, com.payway.telegram.api.tl.schema.TLInputFileLocation.class);
registerClass(0x3d0364ec, com.payway.telegram.api.tl.schema.TLInputVideoFileLocation.class);
registerClass(0xf5235d55, com.payway.telegram.api.tl.schema.TLInputEncryptedFileLocation.class);
registerClass(0x74dc404d, com.payway.telegram.api.tl.schema.TLInputAudioFileLocation.class);
registerClass(0x4e45abe9, com.payway.telegram.api.tl.schema.TLInputDocumentFileLocation.class);
registerClass(0x12b299d4, com.payway.telegram.api.tl.schema.TLStickerPack.class);
registerClass(0xc8d7493e, com.payway.telegram.api.tl.schema.TLChatParticipant.class);
registerClass(0x554abb6f, com.payway.telegram.api.tl.schema.account.TLPrivacyRules.class);
registerClass(0xd07ae726, com.payway.telegram.api.tl.schema.messages.TLStatedMessage.class);
registerClass(0xa9af2881, com.payway.telegram.api.tl.schema.messages.TLStatedMessageLink.class);
registerClass(0x1c138d15, com.payway.telegram.api.tl.schema.contacts.TLBlocked.class);
registerClass(0x900802a1, com.payway.telegram.api.tl.schema.contacts.TLBlockedSlice.class);
registerClass(0xccb03657, com.payway.telegram.api.tl.schema.TLWallPaper.class);
registerClass(0x63117f24, com.payway.telegram.api.tl.schema.TLWallPaperSolid.class);
registerClass(0x9ba2d800, com.payway.telegram.api.tl.schema.TLChatEmpty.class);
registerClass(0x6e9c9bc7, com.payway.telegram.api.tl.schema.TLChat.class);
registerClass(0xfb0ccc41, com.payway.telegram.api.tl.schema.TLChatForbidden.class);
registerClass(0xf392b7f4, com.payway.telegram.api.tl.schema.TLInputContact.class);
registerClass(0x8e1a1775, com.payway.telegram.api.tl.schema.TLNearestDc.class);
registerClass(0xf52ff27f, com.payway.telegram.api.tl.schema.TLInputFile.class);
registerClass(0xfa4f0bb5, com.payway.telegram.api.tl.schema.TLInputFileBig.class);
registerClass(0x72f0eaae, com.payway.telegram.api.tl.schema.TLInputDocumentEmpty.class);
registerClass(0x18798952, com.payway.telegram.api.tl.schema.TLInputDocument.class);
registerClass(0x8150cbd8, com.payway.telegram.api.tl.schema.messages.TLChats.class);
registerClass(0x17c6b5f6, com.payway.telegram.api.tl.schema.help.TLSupport.class);
registerClass(0xd3680c61, com.payway.telegram.api.tl.schema.TLContactStatus.class);
registerClass(0xd22a1c60, com.payway.telegram.api.tl.schema.contacts.TLMyLinkEmpty.class);
registerClass(0x6c69efee, com.payway.telegram.api.tl.schema.contacts.TLMyLinkRequested.class);
registerClass(0xc240ebd9, com.payway.telegram.api.tl.schema.contacts.TLMyLinkContact.class);
registerClass(0x586988d8, com.payway.telegram.api.tl.schema.TLAudioEmpty.class);
registerClass(0xc7ac6496, com.payway.telegram.api.tl.schema.TLAudio.class);
registerClass(0xae636f24, com.payway.telegram.api.tl.schema.TLDisabledFeature.class);
registerClass(0xfffe1bac, com.payway.telegram.api.tl.schema.TLPrivacyValueAllowContacts.class);
registerClass(0x65427b82, com.payway.telegram.api.tl.schema.TLPrivacyValueAllowAll.class);
registerClass(0x4d5bbe0c, com.payway.telegram.api.tl.schema.TLPrivacyValueAllowUsers.class);
registerClass(0xf888fa1a, com.payway.telegram.api.tl.schema.TLPrivacyValueDisallowContacts.class);
registerClass(0x8b73e763, com.payway.telegram.api.tl.schema.TLPrivacyValueDisallowAll.class);
registerClass(0xc7f49b7, com.payway.telegram.api.tl.schema.TLPrivacyValueDisallowUsers.class);
registerClass(0xf1749a22, com.payway.telegram.api.tl.schema.messages.TLStickersNotModified.class);
registerClass(0x8a8ecd32, com.payway.telegram.api.tl.schema.messages.TLStickers.class);
registerClass(0xa4f58c4c, com.payway.telegram.api.tl.schema.account.TLSentChangePhoneCode.class);
registerClass(0x3fedd339, com.payway.telegram.api.tl.schema.TLTrue.class);
registerClass(0x2331b22d, com.payway.telegram.api.tl.schema.TLPhotoEmpty.class);
registerClass(0x22b56751, com.payway.telegram.api.tl.schema.TLPhoto.class);
registerClass(0x58dbcab8, com.payway.telegram.api.tl.schema.TLInputReportReasonSpam.class);
registerClass(0x1e22c78d, com.payway.telegram.api.tl.schema.TLInputReportReasonViolence.class);
registerClass(0x2e59d922, com.payway.telegram.api.tl.schema.TLInputReportReasonPornography.class);
registerClass(0xe1746d0a, com.payway.telegram.api.tl.schema.TLInputReportReasonOther.class);
registerClass(0x13abdb3, com.payway.telegram.api.tl.schema.TLUpdateNewMessage.class);
registerClass(0x4e90bfd6, com.payway.telegram.api.tl.schema.TLUpdateMessageID.class);
registerClass(0xc6649e31, com.payway.telegram.api.tl.schema.TLUpdateReadMessages.class);
registerClass(0xa92bfe26, com.payway.telegram.api.tl.schema.TLUpdateDeleteMessages.class);
registerClass(0x5c486927, com.payway.telegram.api.tl.schema.TLUpdateUserTyping.class);
registerClass(0x9a65ea1f, com.payway.telegram.api.tl.schema.TLUpdateChatUserTyping.class);
registerClass(0x7761198, com.payway.telegram.api.tl.schema.TLUpdateChatParticipants.class);
registerClass(0x1bfbd823, com.payway.telegram.api.tl.schema.TLUpdateUserStatus.class);
registerClass(0xa7332b73, com.payway.telegram.api.tl.schema.TLUpdateUserName.class);
registerClass(0x95313b0c, com.payway.telegram.api.tl.schema.TLUpdateUserPhoto.class);
registerClass(0x2575bbb9, com.payway.telegram.api.tl.schema.TLUpdateContactRegistered.class);
registerClass(0x51a48a9a, com.payway.telegram.api.tl.schema.TLUpdateContactLink.class);
registerClass(0x8f06529a, com.payway.telegram.api.tl.schema.TLUpdateNewAuthorization.class);
registerClass(0x12bcbd9a, com.payway.telegram.api.tl.schema.TLUpdateNewEncryptedMessage.class);
registerClass(0x1710f156, com.payway.telegram.api.tl.schema.TLUpdateEncryptedChatTyping.class);
registerClass(0xb4a2e88d, com.payway.telegram.api.tl.schema.TLUpdateEncryption.class);
registerClass(0x38fe25b7, com.payway.telegram.api.tl.schema.TLUpdateEncryptedMessagesRead.class);
registerClass(0x3a0eeb22, com.payway.telegram.api.tl.schema.TLUpdateChatParticipantAdd.class);
registerClass(0x6e5f8c22, com.payway.telegram.api.tl.schema.TLUpdateChatParticipantDelete.class);
registerClass(0x8e5e9873, com.payway.telegram.api.tl.schema.TLUpdateDcOptions.class);
registerClass(0x80ece81a, com.payway.telegram.api.tl.schema.TLUpdateUserBlocked.class);
registerClass(0xbec268ef, com.payway.telegram.api.tl.schema.TLUpdateNotifySettings.class);
registerClass(0x382dd3e4, com.payway.telegram.api.tl.schema.TLUpdateServiceNotification.class);
registerClass(0xee3b272a, com.payway.telegram.api.tl.schema.TLUpdatePrivacy.class);
registerClass(0x12b9417b, com.payway.telegram.api.tl.schema.TLUpdateUserPhone.class);
registerClass(0xe300cc3b, com.payway.telegram.api.tl.schema.auth.TLCheckedPhone.class);
registerClass(0x1117dd5f, com.payway.telegram.api.tl.schema.TLGeoPointEmpty.class);
registerClass(0x2049d70c, com.payway.telegram.api.tl.schema.TLGeoPoint.class);
registerClass(0xf141b5e1, com.payway.telegram.api.tl.schema.TLInputEncryptedChat.class);
registerClass(0xe317af7e, com.payway.telegram.api.tl.schema.TLUpdatesTooLong.class);
registerClass(0xd3f45784, com.payway.telegram.api.tl.schema.TLUpdateShortMessage.class);
registerClass(0x2b2fbd4e, com.payway.telegram.api.tl.schema.TLUpdateShortChatMessage.class);
registerClass(0x78d4dec1, com.payway.telegram.api.tl.schema.TLUpdateShort.class);
registerClass(0x725b04c3, com.payway.telegram.api.tl.schema.TLUpdatesCombined.class);
registerClass(0x74ae4240, com.payway.telegram.api.tl.schema.TLUpdates.class);
registerClass(0xab3a99ac, com.payway.telegram.api.tl.schema.TLDialog.class);
registerClass(0x770656a8, com.payway.telegram.api.tl.schema.TLInputAppEvent.class);
registerClass(0x6c37c15c, com.payway.telegram.api.tl.schema.TLDocumentAttributeImageSize.class);
registerClass(0x11b58939, com.payway.telegram.api.tl.schema.TLDocumentAttributeAnimated.class);
registerClass(0xfb0a5727, com.payway.telegram.api.tl.schema.TLDocumentAttributeSticker.class);
registerClass(0x5910cccb, com.payway.telegram.api.tl.schema.TLDocumentAttributeVideo.class);
registerClass(0x51448e5, com.payway.telegram.api.tl.schema.TLDocumentAttributeAudio.class);
registerClass(0x15590068, com.payway.telegram.api.tl.schema.TLDocumentAttributeFilename.class);
registerClass(0xf6b673a4, com.payway.telegram.api.tl.schema.auth.TLAuthorization.class);
registerClass(0xd95adc84, com.payway.telegram.api.tl.schema.TLInputAudioEmpty.class);
registerClass(0x77d440ff, com.payway.telegram.api.tl.schema.TLInputAudio.class);
registerClass(0x969478bb, com.payway.telegram.api.tl.schema.messages.TLStatedMessages.class);
registerClass(0x3e74f5c6, com.payway.telegram.api.tl.schema.messages.TLStatedMessagesLinks.class);
registerClass(0xb98886cf, com.payway.telegram.api.tl.schema.TLInputUserEmpty.class);
registerClass(0xf7c1b13f, com.payway.telegram.api.tl.schema.TLInputUserSelf.class);
registerClass(0x86e94f65, com.payway.telegram.api.tl.schema.TLInputUserContact.class);
registerClass(0x655e74ff, com.payway.telegram.api.tl.schema.TLInputUserForeign.class);
registerClass(0x630e61be, com.payway.telegram.api.tl.schema.TLChatFull.class);
registerClass(0x9db1bc6d, com.payway.telegram.api.tl.schema.TLPeerUser.class);
registerClass(0xbad0e5bb, com.payway.telegram.api.tl.schema.TLPeerChat.class);
registerClass(0xeccea3f5, com.payway.telegram.api.tl.schema.contacts.TLLink.class);
registerClass(0xb74ba9d2, com.payway.telegram.api.tl.schema.contacts.TLContactsNotModified.class);
registerClass(0x6f8b8cb2, com.payway.telegram.api.tl.schema.contacts.TLContacts.class);
registerClass(0x37c1011c, com.payway.telegram.api.tl.schema.TLChatPhotoEmpty.class);
registerClass(0x6153276a, com.payway.telegram.api.tl.schema.TLChatPhoto.class);
registerClass(0xad524315, com.payway.telegram.api.tl.schema.contacts.TLImportedContacts.class);
registerClass(0xc10658a8, com.payway.telegram.api.tl.schema.TLVideoEmpty.class);
registerClass(0x388fa391, com.payway.telegram.api.tl.schema.TLVideo.class);
registerClass(0xc21f497e, com.payway.telegram.api.tl.schema.TLEncryptedFileEmpty.class);
registerClass(0x4a70994c, com.payway.telegram.api.tl.schema.TLEncryptedFile.class);
registerClass(0xade6b004, com.payway.telegram.api.tl.schema.TLInputPhotoCropAuto.class);
registerClass(0xd9915325, com.payway.telegram.api.tl.schema.TLInputPhotoCrop.class);
registerClass(0x5649dcc5, com.payway.telegram.api.tl.schema.contacts.TLSuggested.class);
registerClass(0xfd2bb8a, com.payway.telegram.api.tl.schema.TLChatParticipantsForbidden.class);
registerClass(0x7841b415, com.payway.telegram.api.tl.schema.TLChatParticipants.class);
registerClass(0x8987f311, com.payway.telegram.api.tl.schema.help.TLAppUpdate.class);
registerClass(0xc45a6536, com.payway.telegram.api.tl.schema.help.TLNoAppUpdate.class);
registerClass(0xe5d7d19c, com.payway.telegram.api.tl.schema.messages.TLChatFull.class);
registerClass(0xb7de36f2, com.payway.telegram.api.tl.schema.messages.TLAffectedHistory.class);
registerClass(0x200250ba, com.payway.telegram.api.tl.schema.TLUserEmpty.class);
registerClass(0x7007b451, com.payway.telegram.api.tl.schema.TLUserSelf.class);
registerClass(0xcab35e18, com.payway.telegram.api.tl.schema.TLUserContact.class);
registerClass(0xd9ccc4ef, com.payway.telegram.api.tl.schema.TLUserRequest.class);
registerClass(0x75cf7a8, com.payway.telegram.api.tl.schema.TLUserForeign.class);
registerClass(0xd6016d7a, com.payway.telegram.api.tl.schema.TLUserDeleted.class);
registerClass(0x83e5de54, com.payway.telegram.api.tl.schema.TLMessageEmpty.class);
registerClass(0x567699b3, com.payway.telegram.api.tl.schema.TLMessage.class);
registerClass(0xa367e716, com.payway.telegram.api.tl.schema.TLMessageForwarded.class);
registerClass(0x1d86f70e, com.payway.telegram.api.tl.schema.TLMessageService.class);
registerClass(0x20212ca8, com.payway.telegram.api.tl.schema.photos.TLPhoto.class);
registerClass(0x7dae33e0, com.payway.telegram.api.tl.schema.TLConfig.class);
registerClass(0x8c718e87, com.payway.telegram.api.tl.schema.messages.TLMessages.class);
registerClass(0xb446ae3, com.payway.telegram.api.tl.schema.messages.TLMessagesSlice.class);
registerClass(0xbc2eab30, com.payway.telegram.api.tl.schema.TLPrivacyKey.class);
registerClass(0x560f8935, com.payway.telegram.api.tl.schema.messages.TLSentEncryptedMessage.class);
registerClass(0x9493ff32, com.payway.telegram.api.tl.schema.messages.TLSentEncryptedFile.class);
registerClass(0xe17e23c, com.payway.telegram.api.tl.schema.TLPhotoSizeEmpty.class);
registerClass(0x77bfb61b, com.payway.telegram.api.tl.schema.TLPhotoSize.class);
registerClass(0xe9a734fa, com.payway.telegram.api.tl.schema.TLPhotoCachedSize.class);
registerClass(0xb6aef7b0, com.payway.telegram.api.tl.schema.TLMessageActionEmpty.class);
registerClass(0xa6638b9a, com.payway.telegram.api.tl.schema.TLMessageActionChatCreate.class);
registerClass(0xb5a1ce5a, com.payway.telegram.api.tl.schema.TLMessageActionChatEditTitle.class);
registerClass(0x7fcb13a8, com.payway.telegram.api.tl.schema.TLMessageActionChatEditPhoto.class);
registerClass(0x95e3fbef, com.payway.telegram.api.tl.schema.TLMessageActionChatDeletePhoto.class);
registerClass(0x5e3cfc4b, com.payway.telegram.api.tl.schema.TLMessageActionChatAddUser.class);
registerClass(0xb2ae9b0c, com.payway.telegram.api.tl.schema.TLMessageActionChatDeleteUser.class);
registerClass(0xd09e07b, com.payway.telegram.api.tl.schema.TLInputPrivacyValueAllowContacts.class);
registerClass(0x184b35ce, com.payway.telegram.api.tl.schema.TLInputPrivacyValueAllowAll.class);
registerClass(0x131cc67f, com.payway.telegram.api.tl.schema.TLInputPrivacyValueAllowUsers.class);
registerClass(0xba52007, com.payway.telegram.api.tl.schema.TLInputPrivacyValueDisallowContacts.class);
registerClass(0xd66b66c9, com.payway.telegram.api.tl.schema.TLInputPrivacyValueDisallowAll.class);
registerClass(0x90110467, com.payway.telegram.api.tl.schema.TLInputPrivacyValueDisallowUsers.class);
registerClass(0xed18c118, com.payway.telegram.api.tl.schema.TLEncryptedMessage.class);
registerClass(0x23734b06, com.payway.telegram.api.tl.schema.TLEncryptedMessageService.class);
registerClass(0x561bc879, com.payway.telegram.api.tl.schema.TLContactBlocked.class);
registerClass(0x96a18d5, com.payway.telegram.api.tl.schema.upload.TLFile.class);
registerClass(0xc0e24635, com.payway.telegram.api.tl.schema.messages.TLDhConfigNotModified.class);
registerClass(0x2c221edd, com.payway.telegram.api.tl.schema.messages.TLDhConfig.class);
registerClass(0x566000e, com.payway.telegram.api.tl.schema.contacts.TLFound.class);
registerClass(0x15ba6c40, com.payway.telegram.api.tl.schema.messages.TLDialogs.class);
registerClass(0x71e094f3, com.payway.telegram.api.tl.schema.messages.TLDialogsSlice.class);
registerClass(0x16bf744e, com.payway.telegram.api.tl.schema.TLSendMessageTypingAction.class);
registerClass(0xfd5ec8f5, com.payway.telegram.api.tl.schema.TLSendMessageCancelAction.class);
registerClass(0xa187d66f, com.payway.telegram.api.tl.schema.TLSendMessageRecordVideoAction.class);
registerClass(0x92042ff7, com.payway.telegram.api.tl.schema.TLSendMessageUploadVideoAction.class);
registerClass(0xd52f73f7, com.payway.telegram.api.tl.schema.TLSendMessageRecordAudioAction.class);
registerClass(0xe6ac8a6f, com.payway.telegram.api.tl.schema.TLSendMessageUploadAudioAction.class);
registerClass(0x990a3c1a, com.payway.telegram.api.tl.schema.TLSendMessageUploadPhotoAction.class);
registerClass(0x8faee98e, com.payway.telegram.api.tl.schema.TLSendMessageUploadDocumentAction.class);
registerClass(0x176f8ba1, com.payway.telegram.api.tl.schema.TLSendMessageGeoLocationAction.class);
registerClass(0x628cbc6f, com.payway.telegram.api.tl.schema.TLSendMessageChooseContactAction.class);
registerClass(0x771095da, com.payway.telegram.api.tl.schema.TLUserFull.class);
registerClass(0xab7ec0a0, com.payway.telegram.api.tl.schema.TLEncryptedChatEmpty.class);
registerClass(0x3bf703dc, com.payway.telegram.api.tl.schema.TLEncryptedChatWaiting.class);
registerClass(0xc878527e, com.payway.telegram.api.tl.schema.TLEncryptedChatRequested.class);
registerClass(0xfa56ce36, com.payway.telegram.api.tl.schema.TLEncryptedChat.class);
registerClass(0x13d6dd27, com.payway.telegram.api.tl.schema.TLEncryptedChatDiscarded.class);
registerClass(0xefed51d9, com.payway.telegram.api.tl.schema.auth.TLSentCode.class);
registerClass(0xe325edcf, com.payway.telegram.api.tl.schema.auth.TLSentAppCode.class);
registerClass(0x46a2ce98, com.payway.telegram.api.tl.schema.TLInputPeerNotifySettings.class);
registerClass(0xf911c994, com.payway.telegram.api.tl.schema.TLContact.class);
registerClass(0x1837c364, com.payway.telegram.api.tl.schema.TLInputEncryptedFileEmpty.class);
registerClass(0x64bd0306, com.payway.telegram.api.tl.schema.TLInputEncryptedFileUploaded.class);
registerClass(0x5a17b5e5, com.payway.telegram.api.tl.schema.TLInputEncryptedFile.class);
registerClass(0x2dc173c8, com.payway.telegram.api.tl.schema.TLInputEncryptedFileBigUploaded.class);
registerClass(0xea879f95, com.payway.telegram.api.tl.schema.TLContactFound.class);
registerClass(0x7c596b46, com.payway.telegram.api.tl.schema.TLFileLocationUnavailable.class);
registerClass(0x53d69076, com.payway.telegram.api.tl.schema.TLFileLocation.class);
registerClass(0xb8bc5b0c, com.payway.telegram.api.tl.schema.TLInputNotifyPeer.class);
registerClass(0x193b4417, com.payway.telegram.api.tl.schema.TLInputNotifyUsers.class);
registerClass(0x4a95e84e, com.payway.telegram.api.tl.schema.TLInputNotifyChats.class);
registerClass(0xa429b886, com.payway.telegram.api.tl.schema.TLInputNotifyAll.class);
registerClass(0x57e2f66c, com.payway.telegram.api.tl.schema.TLInputMessagesFilterEmpty.class);
registerClass(0x9609a51c, com.payway.telegram.api.tl.schema.TLInputMessagesFilterPhotos.class);
registerClass(0x9fc00e65, com.payway.telegram.api.tl.schema.TLInputMessagesFilterVideo.class);
registerClass(0x56e9f0e4, com.payway.telegram.api.tl.schema.TLInputMessagesFilterPhotoVideo.class);
registerClass(0xd95e73bb, com.payway.telegram.api.tl.schema.TLInputMessagesFilterPhotoVideoDocuments.class);
registerClass(0x9eddf188, com.payway.telegram.api.tl.schema.TLInputMessagesFilterDocument.class);
registerClass(0xcfc87522, com.payway.telegram.api.tl.schema.TLInputMessagesFilterAudio.class);
registerClass(0x5afbf764, com.payway.telegram.api.tl.schema.TLInputMessagesFilterAudioDocuments.class);
registerClass(0x7ef0dd87, com.payway.telegram.api.tl.schema.TLInputMessagesFilterUrl.class);
registerClass(0x2ec2a43c, com.payway.telegram.api.tl.schema.TLDcOption.class);
registerClass(0xadd53cb3, com.payway.telegram.api.tl.schema.TLPeerNotifyEventsEmpty.class);
registerClass(0x6d1ded88, com.payway.telegram.api.tl.schema.TLPeerNotifyEventsAll.class);
registerClass(0xf03064d8, com.payway.telegram.api.tl.schema.TLInputPeerNotifyEventsEmpty.class);
registerClass(0xe86a2c74, com.payway.telegram.api.tl.schema.TLInputPeerNotifyEventsAll.class);
}
}
