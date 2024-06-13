# AddDomainRequestBody


## Fields

| Field                                                                                                                                     | Type                                                                                                                                      | Required                                                                                                                                  | Description                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                                                    | *String*                                                                                                                                  | :heavy_check_mark:                                                                                                                        | The new domain name. Can contain the port for development instances.                                                                      |
| `isSatellite`                                                                                                                             | *boolean*                                                                                                                                 | :heavy_check_mark:                                                                                                                        | Marks the new domain as satellite. Only `true` is accepted at the moment.                                                                 |
| `proxyUrl`                                                                                                                                | *Optional<? extends String>*                                                                                                              | :heavy_minus_sign:                                                                                                                        | The full URL of the proxy which will forward requests to the Clerk Frontend API for this domain. Applicable only to production instances. |