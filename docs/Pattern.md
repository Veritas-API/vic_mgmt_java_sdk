
# Pattern

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]
**id** | **String** |  |  [optional]
**name** | **String** | Display name |  [optional]
**description** | **String** |  |  [optional]
**value** | **String** | The pattern to match on. For type Regex, the value is a regular expression. For type Keyword, the value is a list of keywords (LF-delimited).  Not relevant for type Pattern. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**caseSensitive** | **Boolean** |  |  [optional]
**custom** | **Boolean** |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
BUILTIN | &quot;BuiltIn&quot;
KEYWORD | &quot;Keyword&quot;
REGEX | &quot;Regex&quot;



