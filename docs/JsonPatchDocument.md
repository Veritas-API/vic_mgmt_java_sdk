
# JsonPatchDocument

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**op** | [**OpEnum**](#OpEnum) | The operation to be performed | 
**path** | **String** | Path of the value to operate on | 
**value** | **Object** | The value for the operation. |  [optional]
**from** | **String** |  |  [optional]


<a name="OpEnum"></a>
## Enum: OpEnum
Name | Value
---- | -----
ADD | &quot;add&quot;
REMOVE | &quot;remove&quot;
REPLACE | &quot;replace&quot;
MOVE | &quot;move&quot;
COPY | &quot;copy&quot;
TEST | &quot;test&quot;



