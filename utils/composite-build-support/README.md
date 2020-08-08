This module only exists because gradle doesn't allow you to specify a specific configuration when substituting dependencies 
in a composite build. This problematic because if the project you are replacing does not contain the artifact you need in its
`default` configuration (i.e `shadow` configuration).