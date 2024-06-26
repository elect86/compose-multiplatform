@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package app.group.resources_test.generated.resources

import kotlin.OptIn
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.StringResource

@ExperimentalResourceApi
private object String0 {
    public val PascalCase: StringResource by
    lazy { init_PascalCase() }

    public val _1_kebab_case: StringResource by
    lazy { init__1_kebab_case() }

    public val app_name: StringResource by
    lazy { init_app_name() }

    public val camelCase: StringResource by
    lazy { init_camelCase() }

    public val hello: StringResource by
    lazy { init_hello() }

    public val multi_line: StringResource by
    lazy { init_multi_line() }

    public val str_template: StringResource by
    lazy { init_str_template() }
}

@ExperimentalResourceApi
internal val Res.string.PascalCase: StringResource
    get() = String0.PascalCase

@ExperimentalResourceApi
private fun init_PascalCase(): StringResource = org.jetbrains.compose.resources.StringResource(
    "string:PascalCase", "PascalCase",
    setOf(
        org.jetbrains.compose.resources.ResourceItem(setOf(), "values/strings.cvr", 172, 34),
    )
)

@ExperimentalResourceApi
internal val Res.string._1_kebab_case: StringResource
    get() = String0._1_kebab_case

@ExperimentalResourceApi
private fun init__1_kebab_case(): StringResource = org.jetbrains.compose.resources.StringResource(
    "string:_1_kebab_case", "_1_kebab_case",
    setOf(
        org.jetbrains.compose.resources.ResourceItem(setOf(), "values/strings.cvr", 135, 36),
    )
)

@ExperimentalResourceApi
internal val Res.string.app_name: StringResource
    get() = String0.app_name

@ExperimentalResourceApi
private fun init_app_name(): StringResource = org.jetbrains.compose.resources.StringResource(
    "string:app_name", "app_name",
    setOf(
        org.jetbrains.compose.resources.ResourceItem(setOf(), "values/strings.cvr", 207, 44),
    )
)

@ExperimentalResourceApi
internal val Res.string.camelCase: StringResource
    get() = String0.camelCase

@ExperimentalResourceApi
private fun init_camelCase(): StringResource = org.jetbrains.compose.resources.StringResource(
    "string:camelCase", "camelCase",
    setOf(
        org.jetbrains.compose.resources.ResourceItem(setOf(), "values/strings.cvr", 252, 29),
    )
)

@ExperimentalResourceApi
internal val Res.string.hello: StringResource
    get() = String0.hello

@ExperimentalResourceApi
private fun init_hello(): StringResource = org.jetbrains.compose.resources.StringResource(
    "string:hello", "hello",
    setOf(
        org.jetbrains.compose.resources.ResourceItem(setOf(), "values/strings.cvr", 282, 37),
    )
)

@ExperimentalResourceApi
internal val Res.string.multi_line: StringResource
    get() = String0.multi_line

@ExperimentalResourceApi
private fun init_multi_line(): StringResource = org.jetbrains.compose.resources.StringResource(
    "string:multi_line", "multi_line",
    setOf(
        org.jetbrains.compose.resources.ResourceItem(setOf(), "values/strings.cvr", 320, 178),
    )
)

@ExperimentalResourceApi
internal val Res.string.str_template: StringResource
    get() = String0.str_template

@ExperimentalResourceApi
private fun init_str_template(): StringResource = org.jetbrains.compose.resources.StringResource(
    "string:str_template", "str_template",
    setOf(
        org.jetbrains.compose.resources.ResourceItem(setOf(), "values/strings.cvr", 499, 76),
    )
)