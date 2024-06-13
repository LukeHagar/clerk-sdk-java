# Admin


## Fields

| Field                                                                                                                 | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `status`                                                                                                              | [com.clerk.backend_api.models.components.AdminVerificationStatus](../../models/components/AdminVerificationStatus.md) | :heavy_check_mark:                                                                                                    | N/A                                                                                                                   |
| `strategy`                                                                                                            | [com.clerk.backend_api.models.components.VerificationStrategy](../../models/components/VerificationStrategy.md)       | :heavy_check_mark:                                                                                                    | N/A                                                                                                                   |
| `attempts`                                                                                                            | *JsonNullable<? extends Long>*                                                                                        | :heavy_minus_sign:                                                                                                    | N/A                                                                                                                   |
| `expireAt`                                                                                                            | *JsonNullable<? extends Long>*                                                                                        | :heavy_minus_sign:                                                                                                    | N/A                                                                                                                   |