
# SDTemplateCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the template (ex. Bronze Axe) | 
**cap** | **kotlin.String** | u96 Number as String (ex. 200000000)  | 
**type** | [**inline**](#Type) | FT is a currency where every instance is the same, NFT is where every token instance differes (ex. FT) | 
**props** | [**SDTemplateCreateRequestProps**](SDTemplateCreateRequestProps.md) |  | 
**contractType** | [**inline**](#ContractType) | The type of custom contract to use for this template. Default will use a shared contract. |  [optional]
**ownerAddress** | **kotlin.String** | Blockchain address to set as owner of the custom contract. Required if contractType is set. |  [optional]
**publicContractMetadata** | [**kotlin.Any**](.md) | Returned to marketplaces as contract metadata |  [optional]
**symbol** | **kotlin.String** | For ERC20 contracts, this is the ticker symbol |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | FT, NFT


<a name="ContractType"></a>
## Enum: contractType
Name | Value
---- | -----
contractType | internal-mint, ERC721, ERC20



