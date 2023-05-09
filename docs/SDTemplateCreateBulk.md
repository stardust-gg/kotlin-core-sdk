
# SDTemplateCreateBulk

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the template (ex. Bronze Axe) | 
**image** | **kotlin.String** | image url | 
**cap** | **kotlin.String** | u96 Number as String (ex. 200000000), default 39614081257132168796771975168  |  [optional]
**contractType** | [**inline**](#ContractType) | The type of custom contract to use for this template. Default will use a shared contract. |  [optional]
**type** | [**inline**](#Type) | FT is a currency where every instance is the same, NFT is where every token instance differes (ex. FT) |  [optional]
**description** | **kotlin.String** | Description of template |  [optional]
**activeListing** | **kotlin.Boolean** | Set if the Template is active or not |  [optional]
**ownerAddress** | **kotlin.String** | Blockchain address to set as owner of the custom contract, if contractType is passed in. |  [optional]
**props** | [**SDTemplateCreateBulkProps**](SDTemplateCreateBulkProps.md) |  |  [optional]
**publicContractMetadata** | [**kotlin.Any**](.md) | Returned to marketplaces as contract metadata |  [optional]
**publicTokenMetadata** | [**kotlin.Any**](.md) | Inherited by tokens, and returned to marketplaces as token metadata |  [optional]


<a name="ContractType"></a>
## Enum: contractType
Name | Value
---- | -----
contractType | ERC721


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | FT, NFT



