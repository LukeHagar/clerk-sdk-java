# InvitationRevoked


## Fields

| Field                                                                                                                                                     | Type                                                                                                                                                      | Required                                                                                                                                                  | Description                                                                                                                                               | Example                                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `object`                                                                                                                                                  | [com.clerk.backend_api.models.components.InvitationRevokedObject](../../models/components/InvitationRevokedObject.md)                                     | :heavy_check_mark:                                                                                                                                        | N/A                                                                                                                                                       |                                                                                                                                                           |
| `id`                                                                                                                                                      | *String*                                                                                                                                                  | :heavy_check_mark:                                                                                                                                        | N/A                                                                                                                                                       |                                                                                                                                                           |
| `emailAddress`                                                                                                                                            | *String*                                                                                                                                                  | :heavy_check_mark:                                                                                                                                        | N/A                                                                                                                                                       |                                                                                                                                                           |
| `publicMetadata`                                                                                                                                          | [Optional<? extends com.clerk.backend_api.models.components.InvitationRevokedPublicMetadata>](../../models/components/InvitationRevokedPublicMetadata.md) | :heavy_minus_sign:                                                                                                                                        | N/A                                                                                                                                                       |                                                                                                                                                           |
| `revoked`                                                                                                                                                 | *Optional<? extends Boolean>*                                                                                                                             | :heavy_minus_sign:                                                                                                                                        | N/A                                                                                                                                                       | true                                                                                                                                                      |
| `status`                                                                                                                                                  | [com.clerk.backend_api.models.components.InvitationRevokedStatus](../../models/components/InvitationRevokedStatus.md)                                     | :heavy_check_mark:                                                                                                                                        | N/A                                                                                                                                                       | revoked                                                                                                                                                   |
| `url`                                                                                                                                                     | *JsonNullable<? extends String>*                                                                                                                          | :heavy_minus_sign:                                                                                                                                        | N/A                                                                                                                                                       |                                                                                                                                                           |
| `createdAt`                                                                                                                                               | *long*                                                                                                                                                    | :heavy_check_mark:                                                                                                                                        | Unix timestamp of creation.<br/>                                                                                                                          |                                                                                                                                                           |
| `updatedAt`                                                                                                                                               | *long*                                                                                                                                                    | :heavy_check_mark:                                                                                                                                        | Unix timestamp of last update.<br/>                                                                                                                       |                                                                                                                                                           |