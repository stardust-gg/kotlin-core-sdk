# gg.stardust.coresdk - Kotlin client library for Stardust API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate an API client.

- API version: 2023-05-08T04:33:59Z
- Package version: 
- Build package: org.openapitools.codegen.languages.KotlinClientCodegen

## Requires

* Kotlin 1.7.21
* Gradle 7.5

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://core-api.stardust.gg/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GameEndpointsApi* | [**gameGetGet**](docs/GameEndpointsApi.md#gamegetget) | **GET** /game/get | Get Game
*GameEndpointsApi* | [**gameMutatePut**](docs/GameEndpointsApi.md#gamemutateput) | **PUT** /game/mutate | Mutate Game
*HealthEndpointsApi* | [**healthGet**](docs/HealthEndpointsApi.md#healthget) | **GET** /health | Get Health
*OrderEndpointsApi* | [**orderBuyPost**](docs/OrderEndpointsApi.md#orderbuypost) | **POST** /order/buy | Buy Order
*OrderEndpointsApi* | [**orderCancelDelete**](docs/OrderEndpointsApi.md#ordercanceldelete) | **DELETE** /order/cancel | Cancel Order
*OrderEndpointsApi* | [**orderCreatePost**](docs/OrderEndpointsApi.md#ordercreatepost) | **POST** /order/create | Create Order
*OrderEndpointsApi* | [**orderGetAllGet**](docs/OrderEndpointsApi.md#ordergetallget) | **GET** /order/get-all | Get All Orders
*OrderEndpointsApi* | [**orderGetGet**](docs/OrderEndpointsApi.md#ordergetget) | **GET** /order/get | Get Order
*PlayerEndpointsApi* | [**playerCountGet**](docs/PlayerEndpointsApi.md#playercountget) | **GET** /player/count | Get Player Count
*PlayerEndpointsApi* | [**playerCreatePost**](docs/PlayerEndpointsApi.md#playercreatepost) | **POST** /player/create | Create Player
*PlayerEndpointsApi* | [**playerGetAllGet**](docs/PlayerEndpointsApi.md#playergetallget) | **GET** /player/get-all | Get All Players
*PlayerEndpointsApi* | [**playerGetGet**](docs/PlayerEndpointsApi.md#playergetget) | **GET** /player/get | Get Player
*PlayerEndpointsApi* | [**playerGetIdGet**](docs/PlayerEndpointsApi.md#playergetidget) | **GET** /player/get-id | Get Player ID
*PlayerEndpointsApi* | [**playerGetIdsGet**](docs/PlayerEndpointsApi.md#playergetidsget) | **GET** /player/get-ids | Get All Player IDs
*PlayerEndpointsApi* | [**playerGetInventoryGet**](docs/PlayerEndpointsApi.md#playergetinventoryget) | **GET** /player/get-inventory | Get Player Inventory
*PlayerEndpointsApi* | [**playerMutatePut**](docs/PlayerEndpointsApi.md#playermutateput) | **PUT** /player/mutate | Mutate Player
*PlayerEndpointsApi* | [**playerRemoveDelete**](docs/PlayerEndpointsApi.md#playerremovedelete) | **DELETE** /player/remove | Remove Player
*PlayerEndpointsApi* | [**playerWalletGetGet**](docs/PlayerEndpointsApi.md#playerwalletgetget) | **GET** /player/wallet-get | Get Player Wallet
*PlayerEndpointsApi* | [**playerWithdrawPost**](docs/PlayerEndpointsApi.md#playerwithdrawpost) | **POST** /player/withdraw | Withdraw From Player
*TemplateEndpointsApi* | [**templateCountGet**](docs/TemplateEndpointsApi.md#templatecountget) | **GET** /template/count | Get Template Count
*TemplateEndpointsApi* | [**templateCreatePost**](docs/TemplateEndpointsApi.md#templatecreatepost) | **POST** /template/create | Create Template
*TemplateEndpointsApi* | [**templateGetAllGet**](docs/TemplateEndpointsApi.md#templategetallget) | **GET** /template/get-all | Get All Templates
*TemplateEndpointsApi* | [**templateGetGet**](docs/TemplateEndpointsApi.md#templategetget) | **GET** /template/get | Get Template
*TemplateEndpointsApi* | [**templateGetTokensGet**](docs/TemplateEndpointsApi.md#templategettokensget) | **GET** /template/get-tokens | Get Template Tokens
*TemplateEndpointsApi* | [**templateMutatePut**](docs/TemplateEndpointsApi.md#templatemutateput) | **PUT** /template/mutate | Mutate Template
*TemplateEndpointsApi* | [**templatePropsRemoveDelete**](docs/TemplateEndpointsApi.md#templatepropsremovedelete) | **DELETE** /template/props-remove | Remove Template Property
*TemplateEndpointsApi* | [**templateRemoveDelete**](docs/TemplateEndpointsApi.md#templateremovedelete) | **DELETE** /template/remove | Remove Template
*TokenEndpointsApi* | [**tokenBurnPost**](docs/TokenEndpointsApi.md#tokenburnpost) | **POST** /token/burn | Burn Token
*TokenEndpointsApi* | [**tokenGetGet**](docs/TokenEndpointsApi.md#tokengetget) | **GET** /token/get | Get Token
*TokenEndpointsApi* | [**tokenMintBulkPost**](docs/TokenEndpointsApi.md#tokenmintbulkpost) | **POST** /token/mint-bulk | Mint Tokens
*TokenEndpointsApi* | [**tokenMutatePut**](docs/TokenEndpointsApi.md#tokenmutateput) | **PUT** /token/mutate | Mutate Token
*TokenEndpointsApi* | [**tokenPropsRemoveDelete**](docs/TokenEndpointsApi.md#tokenpropsremovedelete) | **DELETE** /token/props-remove | Remove Token Property
*TokenEndpointsApi* | [**tokenTransferPost**](docs/TokenEndpointsApi.md#tokentransferpost) | **POST** /token/transfer | Transfer Tokens
*TokenEndpointsApi* | [**tokenWithdrawPost**](docs/TokenEndpointsApi.md#tokenwithdrawpost) | **POST** /token/withdraw | Withdraw Token


<a name="documentation-for-models"></a>
## Documentation for Models

 - [gg.stardust.coresdk.models.Error](docs/Error.md)
 - [gg.stardust.coresdk.models.SDGameGetResponse](docs/SDGameGetResponse.md)
 - [gg.stardust.coresdk.models.SDGameGetResponseFeesInner](docs/SDGameGetResponseFeesInner.md)
 - [gg.stardust.coresdk.models.SDGameMutateRequest](docs/SDGameMutateRequest.md)
 - [gg.stardust.coresdk.models.SDHealthResponse](docs/SDHealthResponse.md)
 - [gg.stardust.coresdk.models.SDOrderBuyRequest](docs/SDOrderBuyRequest.md)
 - [gg.stardust.coresdk.models.SDOrderCancelRequest](docs/SDOrderCancelRequest.md)
 - [gg.stardust.coresdk.models.SDOrderCancelResponse](docs/SDOrderCancelResponse.md)
 - [gg.stardust.coresdk.models.SDOrderCreateRequest](docs/SDOrderCreateRequest.md)
 - [gg.stardust.coresdk.models.SDOrderCreateResponse](docs/SDOrderCreateResponse.md)
 - [gg.stardust.coresdk.models.SDOrderCreateTokens](docs/SDOrderCreateTokens.md)
 - [gg.stardust.coresdk.models.SDOrderGetAllResponse](docs/SDOrderGetAllResponse.md)
 - [gg.stardust.coresdk.models.SDOrderGetAllResponseTokensRequestedInner](docs/SDOrderGetAllResponseTokensRequestedInner.md)
 - [gg.stardust.coresdk.models.SDOrderGetResponse](docs/SDOrderGetResponse.md)
 - [gg.stardust.coresdk.models.SDPlayerCountResponse](docs/SDPlayerCountResponse.md)
 - [gg.stardust.coresdk.models.SDPlayerCreateJWTObject](docs/SDPlayerCreateJWTObject.md)
 - [gg.stardust.coresdk.models.SDPlayerCreateRequest](docs/SDPlayerCreateRequest.md)
 - [gg.stardust.coresdk.models.SDPlayerCreateResponse](docs/SDPlayerCreateResponse.md)
 - [gg.stardust.coresdk.models.SDPlayerGetAllResponse](docs/SDPlayerGetAllResponse.md)
 - [gg.stardust.coresdk.models.SDPlayerGetIdResponse](docs/SDPlayerGetIdResponse.md)
 - [gg.stardust.coresdk.models.SDPlayerGetIdsResponse](docs/SDPlayerGetIdsResponse.md)
 - [gg.stardust.coresdk.models.SDPlayerGetInventoryResponse](docs/SDPlayerGetInventoryResponse.md)
 - [gg.stardust.coresdk.models.SDPlayerGetResponse](docs/SDPlayerGetResponse.md)
 - [gg.stardust.coresdk.models.SDPlayerMutateRequest](docs/SDPlayerMutateRequest.md)
 - [gg.stardust.coresdk.models.SDPlayerWalletGetResponse](docs/SDPlayerWalletGetResponse.md)
 - [gg.stardust.coresdk.models.SDPlayerWalletGetResponseWalletInner](docs/SDPlayerWalletGetResponseWalletInner.md)
 - [gg.stardust.coresdk.models.SDPlayerWalletGetResponseWalletInnerMoniesInner](docs/SDPlayerWalletGetResponseWalletInnerMoniesInner.md)
 - [gg.stardust.coresdk.models.SDPlayerWithdrawObject](docs/SDPlayerWithdrawObject.md)
 - [gg.stardust.coresdk.models.SDPlayerWithdrawRequest](docs/SDPlayerWithdrawRequest.md)
 - [gg.stardust.coresdk.models.SDTemplateCountResponse](docs/SDTemplateCountResponse.md)
 - [gg.stardust.coresdk.models.SDTemplateCreateBulk](docs/SDTemplateCreateBulk.md)
 - [gg.stardust.coresdk.models.SDTemplateCreateBulkProps](docs/SDTemplateCreateBulkProps.md)
 - [gg.stardust.coresdk.models.SDTemplateCreateRequest](docs/SDTemplateCreateRequest.md)
 - [gg.stardust.coresdk.models.SDTemplateCreateRequestProps](docs/SDTemplateCreateRequestProps.md)
 - [gg.stardust.coresdk.models.SDTemplateCreateResponse](docs/SDTemplateCreateResponse.md)
 - [gg.stardust.coresdk.models.SDTemplateGetAllResponse](docs/SDTemplateGetAllResponse.md)
 - [gg.stardust.coresdk.models.SDTemplateGetAllResponseProps](docs/SDTemplateGetAllResponseProps.md)
 - [gg.stardust.coresdk.models.SDTemplateGetResponse](docs/SDTemplateGetResponse.md)
 - [gg.stardust.coresdk.models.SDTemplateGetTokensResponse](docs/SDTemplateGetTokensResponse.md)
 - [gg.stardust.coresdk.models.SDTemplateGetTokensResponsePlayer](docs/SDTemplateGetTokensResponsePlayer.md)
 - [gg.stardust.coresdk.models.SDTemplateGetTokensResponseToken](docs/SDTemplateGetTokensResponseToken.md)
 - [gg.stardust.coresdk.models.SDTemplateGetTokensResponseTokenProps](docs/SDTemplateGetTokensResponseTokenProps.md)
 - [gg.stardust.coresdk.models.SDTemplateMutateRequest](docs/SDTemplateMutateRequest.md)
 - [gg.stardust.coresdk.models.SDTokenBurnRequest](docs/SDTokenBurnRequest.md)
 - [gg.stardust.coresdk.models.SDTokenBurnRequestTokenObjectsInner](docs/SDTokenBurnRequestTokenObjectsInner.md)
 - [gg.stardust.coresdk.models.SDTokenGetResponse](docs/SDTokenGetResponse.md)
 - [gg.stardust.coresdk.models.SDTokenMintBulkRequest](docs/SDTokenMintBulkRequest.md)
 - [gg.stardust.coresdk.models.SDTokenMintBulkTokenObject](docs/SDTokenMintBulkTokenObject.md)
 - [gg.stardust.coresdk.models.SDTokenMintBulkTokenObjectProps](docs/SDTokenMintBulkTokenObjectProps.md)
 - [gg.stardust.coresdk.models.SDTokenMutateRequest](docs/SDTokenMutateRequest.md)
 - [gg.stardust.coresdk.models.SDTokenTransferRequest](docs/SDTokenTransferRequest.md)
 - [gg.stardust.coresdk.models.SDTokenWithdrawObject](docs/SDTokenWithdrawObject.md)
 - [gg.stardust.coresdk.models.SDTokenWithdrawRequest](docs/SDTokenWithdrawRequest.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="api_key"></a>
### api_key

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header

