
# OperatorNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Determines whether this node is a condition node or an operator node. NOTE: If ConditionNode &amp; OperatorNode are not visible in the Swagger UI, please consult the Swagger json for details. | 
**operator** | [**OperatorEnum**](#OperatorEnum) |  |  [optional]
**min** | **Integer** | The minimum number of child nodes that must match.  Only applies if the operator is OR. |  [optional]
**minOverridden** | **Boolean** |  |  [optional]
**proximity** | **Integer** | Optional proximity of the first child condition to the other child conditions.  If specified, the operator must be AND, and the child nodes must all be conditions (no operators).  There must be at least two child conditions and they must all be keyword or regex.  The child conditions must not have a minCount greater than 1, and must apply to the full content (not metadata fields). |  [optional]
**proximityMode** | [**ProximityModeEnum**](#ProximityModeEnum) |  |  [optional]
**earlyOut** | **Boolean** |  |  [optional]
**children** | [**List&lt;Node&gt;**](Node.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CONDITION | &quot;condition&quot;
OPERATOR | &quot;operator&quot;


<a name="OperatorEnum"></a>
## Enum: OperatorEnum
Name | Value
---- | -----
AND | &quot;AND&quot;
OR | &quot;OR&quot;
NOT | &quot;NOT&quot;


<a name="ProximityModeEnum"></a>
## Enum: ProximityModeEnum
Name | Value
---- | -----
FROMFIRSTCONDITION | &quot;FromFirstCondition&quot;
SLIDINGWINDOW | &quot;SlidingWindow&quot;



