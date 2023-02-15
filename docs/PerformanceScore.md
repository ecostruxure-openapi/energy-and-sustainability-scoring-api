

# PerformanceScore


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **LocalDate** |  |  |
|**score** | **BigDecimal** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**category** | [**CategoryEnum**](#CategoryEnum) |  |  |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;daily&quot; |
| MONTHLY | &quot;monthly&quot; |
| LOCALAVERAGE | &quot;localAverage&quot; |
| AVERAGE | &quot;average&quot; |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| ENERGY | &quot;energy&quot; |
| WATER | &quot;water&quot; |
| WASTE | &quot;waste&quot; |
| TRANSPORTATION | &quot;transportation&quot; |
| HUMANEXPERIENCE | &quot;humanExperience&quot; |
| REENTRY | &quot;reEntry&quot; |



