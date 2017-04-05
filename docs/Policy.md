
# Policy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]
**id** | **String** |  |  [optional]
**name** | **String** | Display name |  [optional]
**description** | **String** |  |  [optional]
**enabled** | **Boolean** | If true, the policy is active for the tenant and will be used for document classification. |  [optional]
**categories** | **List&lt;String&gt;** | A list of categories that the policy falls into.  Categories may be hierarchical, e.g. industry/medical |  [optional]
**tags** | **List&lt;String&gt;** | The tags returned from a classification operation when the policy matches a document. |  [optional]
**body** | [**PolicyBody**](PolicyBody.md) | Policy body that defines how rules are used to enforce the policy. |  [optional]
**engineBody** | **String** | Policy body in its raw engine-specific form. May be empty for custom policies. |  [optional]
**custom** | **Boolean** | If true the policy is a custom policy defined by a user.  If false, the policy is a standard built-in policy. |  [optional]



