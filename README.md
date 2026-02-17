# selenium_concept
This cover Selenium concepts

Dynamic Xpath creation:
XPATH Customization - 
Syntax = //tagname[@attribute='value']

Function - starts-with()
Syntax = //tagname[starts-with(@attribute,'value')]

Function - contains()
Syntax = //tagname[contains(@attribute,'value')]

Function - text()
Syntax = //tagname[text()='Mention the inner text here']

Logical Operator - and/ or
Syntax = //tagname[@attribute1 = 'value1' and @attribute2 = 'value2']
Syntax = //tagname[@attribute1 = 'value1' or @attribute2 = 'value2']

LOCATOR - AXIS [Element where you start with is known as SELF]
CHILD - In the HTML DOM, it is inside the PARENT HTML Tag.
Syntax = //XPATH of the SELF element/child::tagname of the child
PARENT - In the HTML DOM, it is 1 leve above the self element.
Syntax = XPATH of the SELF element/parent::tagname of parent
ANCESTOR - 2 Level above the self [Example can be Grand Parents]
Syntax = //XPATH of the SELF element/ancestor::tagname of the ancestor
DESCEDANT - 2 Level below the self [Example can be Grand Children]
Syntax - //XPATH of the SELF element/descedant::tagname of the descedant
FOLLOWING - At the same level and HTML code of this element is just below SELF. Example can be your bother or sister
Syntax = //XPATH of the SELF element/following::tagname of the following element
PRECEDING - At the same level of SELF and HTML code of this element is just above SELF. Example can be your bother or sister
Syntax = //XPATH of the SELF element/prededing::tagname of the prededing element
