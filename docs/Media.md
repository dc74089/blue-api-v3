# Media

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | String type of the media element. | 
**foreignKey** | **String** | The key used to identify this media on the media site. | 
**details** | **Object** | If required, a JSON dict of additional media information. |  [optional]
**preferred** | **Boolean** | True if the media is of high quality. |  [optional]
**directUrl** | **String** | Direct URL to the media. |  [optional]
**viewUrl** | **String** | The URL that leads to the full web page for the media, if one exists. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
YOUTUBE | &quot;youtube&quot;
CDPHOTOTHREAD | &quot;cdphotothread&quot;
IMGUR | &quot;imgur&quot;
FACEBOOK_PROFILE | &quot;facebook-profile&quot;
YOUTUBE_CHANNEL | &quot;youtube-channel&quot;
TWITTER_PROFILE | &quot;twitter-profile&quot;
GITHUB_PROFILE | &quot;github-profile&quot;
INSTAGRAM_PROFILE | &quot;instagram-profile&quot;
PERISCOPE_PROFILE | &quot;periscope-profile&quot;
GRABCAD | &quot;grabcad&quot;
INSTAGRAM_IMAGE | &quot;instagram-image&quot;
EXTERNAL_LINK | &quot;external-link&quot;
AVATAR | &quot;avatar&quot;
