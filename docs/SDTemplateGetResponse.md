
# SDTemplateGetResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gameId** | **kotlin.Int** | Game ID Number (unsigned 32 bit integer) | 
**id** | **kotlin.Int** |  | 
**cap** | **kotlin.String** | u96 Number as String, min: 0, max: 39614081257132168796771975167 | 
**totalSupply** | **kotlin.String** | u96 Number as String, min: 0, max: 39614081257132168796771975167 | 
**name** | **kotlin.String** | The name of the template | 
**type** | [**inline**](#Type) |  | 
**props** | [**SDTemplateGetAllResponseProps**](SDTemplateGetAllResponseProps.md) |  | 
**contractType** | [**inline**](#ContractType) | The type of custom contract bieng used for this template. |  [optional]
**publicContractMetadata** | [**kotlin.Any**](.md) | Returned to marketplaces as contract metadata |  [optional]
**publicTokenMetadata** | [**kotlin.Any**](.md) | Inherited by tokens, and returned to marketplaces as token metadata |  [optional]
**fees** | [**kotlin.collections.List&lt;SDGameGetResponseFeesInner&gt;**](SDGameGetResponseFeesInner.md) |  |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | FT, NFT


<a name="ContractType"></a>
## Enum: contractType
Name | Value
---- | -----
contractType | ERC721, internal-mint, external-no-mint



