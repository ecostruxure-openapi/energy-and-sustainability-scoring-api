

# Error

Error occurred while handling the request (based on rfc7807)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **URI** | A URI reference [RFC3986] that identifies the problem type. |  |
|**title** | **String** | A short, human-readable summary of the problem type. |  [optional] |
|**status** | **BigDecimal** | The HTTP status code ([RFC7231], Section 6) generated by the origin server for this occurrence of the problem. |  [optional] |
|**instance** | **String** | A URI reference that identifies the specific occurrence of the problem. |  [optional] |
|**detail** | **String** | A human-readable explanation specific to this occurrence of the problem. |  [optional] |
|**debugging** | **String** | Debugging information for DEV and QA environments. |  [optional] |
|**invalidParams** | [**Set&lt;ErrorInvalidParamsInner&gt;**](ErrorInvalidParamsInner.md) | An array of validation errors. |  [optional] |



