/*
 * generated by Xtext 2.16.0
 */
lexer grammar InternalBReactLexer;

@header {
package org.xtext.bmod.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

Farthest : 'farthest';

Burning : 'burning';

Nearest : 'nearest';

Person : 'Person';

Action : 'action';

Global : 'global';

Normal : 'normal';

Shared : 'shared';

First : 'first';

Cell : 'Cell';

Door : 'Door';

Exit : 'Exit';

Fire : 'Fire';

Find : 'find';

From : 'from';

Last : 'last';

Colon : ':';

Semicolon : ';';

RULE_VARNAME : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
