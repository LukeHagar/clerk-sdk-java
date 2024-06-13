# SignUp


## Fields

| Field                                                                                                                               | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `object`                                                                                                                            | [com.clerk.backend_api.models.components.SignUpObject](../../models/components/SignUpObject.md)                                     | :heavy_check_mark:                                                                                                                  | N/A                                                                                                                                 |
| `id`                                                                                                                                | *String*                                                                                                                            | :heavy_check_mark:                                                                                                                  | N/A                                                                                                                                 |
| `status`                                                                                                                            | [com.clerk.backend_api.models.components.SignUpStatus](../../models/components/SignUpStatus.md)                                     | :heavy_check_mark:                                                                                                                  | N/A                                                                                                                                 |
| `requiredFields`                                                                                                                    | List<*String*>                                                                                                                      | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |
| `optionalFields`                                                                                                                    | List<*String*>                                                                                                                      | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |
| `missingFields`                                                                                                                     | List<*String*>                                                                                                                      | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |
| `unverifiedFields`                                                                                                                  | List<*String*>                                                                                                                      | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |
| `verifications`                                                                                                                     | [Optional<? extends com.clerk.backend_api.models.components.Verifications>](../../models/components/Verifications.md)               | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |
| `username`                                                                                                                          | *JsonNullable<? extends String>*                                                                                                    | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |
| `emailAddress`                                                                                                                      | *JsonNullable<? extends String>*                                                                                                    | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |
| `phoneNumber`                                                                                                                       | *JsonNullable<? extends String>*                                                                                                    | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |
| `web3Wallet`                                                                                                                        | *JsonNullable<? extends String>*                                                                                                    | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |
| `passwordEnabled`                                                                                                                   | *boolean*                                                                                                                           | :heavy_check_mark:                                                                                                                  | N/A                                                                                                                                 |
| `firstName`                                                                                                                         | *JsonNullable<? extends String>*                                                                                                    | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |
| `lastName`                                                                                                                          | *JsonNullable<? extends String>*                                                                                                    | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |
| `unsafeMetadata`                                                                                                                    | [Optional<? extends com.clerk.backend_api.models.components.SignUpUnsafeMetadata>](../../models/components/SignUpUnsafeMetadata.md) | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |
| `publicMetadata`                                                                                                                    | [Optional<? extends com.clerk.backend_api.models.components.SignUpPublicMetadata>](../../models/components/SignUpPublicMetadata.md) | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |
| `customAction`                                                                                                                      | *boolean*                                                                                                                           | :heavy_check_mark:                                                                                                                  | N/A                                                                                                                                 |
| `externalId`                                                                                                                        | *JsonNullable<? extends String>*                                                                                                    | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |
| `createdSessionId`                                                                                                                  | *JsonNullable<? extends String>*                                                                                                    | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |
| `createdUserId`                                                                                                                     | *JsonNullable<? extends String>*                                                                                                    | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |
| `abandonAt`                                                                                                                         | *long*                                                                                                                              | :heavy_check_mark:                                                                                                                  | N/A                                                                                                                                 |
| `externalAccount`                                                                                                                   | [Optional<? extends com.clerk.backend_api.models.components.ExternalAccount>](../../models/components/ExternalAccount.md)           | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |