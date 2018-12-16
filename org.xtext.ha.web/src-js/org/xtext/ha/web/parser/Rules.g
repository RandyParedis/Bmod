/**
 * @Generated
 */
grammar Rules;

options {
  language=JavaScript;
  output=AST;
  ASTLabelType=CommonTree;
}

@lexer::header {
}

@parser::header {
}




rule_Model:
	declarations_0+=rule_Declaration* EOF!;



rule_Declaration:
	rule_Device | rule_Rule;



rule_Device:
	'Device' name_0=ID 'can' 'be' states_1+=rule_State (',' states_2+=rule_State)*;



rule_State:
	name_0=ID ;



rule_Rule:
	'Rule' description_0=STRING
		'when' when_1=super::null
		'then' then_2=super::null;



rule_QualifiedName: ID '.' ID;

ID : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;

STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

COMMENT : ('/*' .* '*/' | '//' ~('\r' | '\n')*)   { $channel = HIDDEN; } ;

WS:  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;} ;

INT: ('0'..'9')+;

