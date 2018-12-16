// $ANTLR 3.3 avr. 19, 2016 01:13:22 /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g 2018-12-16 14:44:48

package org.xtext.ha.web.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.ha.services.RulesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalRulesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Device'", "'can'", "'be'", "','", "'Rule'", "'when'", "'then'", "'.'"
    };
    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;

    // delegates
    // delegators


        public InternalRulesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRulesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRulesParser.tokenNames; }
    public String getGrammarFileName() { return "/home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g"; }


     
     	private RulesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RulesGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:58:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:59:1: ( ruleModel EOF )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:60:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:67:1: ruleModel : ( ( rule__Model__DeclarationsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:71:2: ( ( ( rule__Model__DeclarationsAssignment )* ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:72:1: ( ( rule__Model__DeclarationsAssignment )* )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:72:1: ( ( rule__Model__DeclarationsAssignment )* )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:73:1: ( rule__Model__DeclarationsAssignment )*
            {
             before(grammarAccess.getModelAccess().getDeclarationsAssignment()); 
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:74:1: ( rule__Model__DeclarationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:74:2: rule__Model__DeclarationsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__DeclarationsAssignment_in_ruleModel94);
            	    rule__Model__DeclarationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDeclarationsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDeclaration"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:86:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:87:1: ( ruleDeclaration EOF )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:88:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration122);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:95:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:99:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:100:1: ( ( rule__Declaration__Alternatives ) )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:100:1: ( ( rule__Declaration__Alternatives ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:101:1: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:102:1: ( rule__Declaration__Alternatives )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:102:2: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration155);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleDevice"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:114:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:115:1: ( ruleDevice EOF )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:116:1: ruleDevice EOF
            {
             before(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_ruleDevice_in_entryRuleDevice182);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getDeviceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDevice189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:123:1: ruleDevice : ( ( rule__Device__Group__0 ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:127:2: ( ( ( rule__Device__Group__0 ) ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:128:1: ( ( rule__Device__Group__0 ) )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:128:1: ( ( rule__Device__Group__0 ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:129:1: ( rule__Device__Group__0 )
            {
             before(grammarAccess.getDeviceAccess().getGroup()); 
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:130:1: ( rule__Device__Group__0 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:130:2: rule__Device__Group__0
            {
            pushFollow(FOLLOW_rule__Device__Group__0_in_ruleDevice215);
            rule__Device__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleState"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:142:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:143:1: ( ruleState EOF )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:144:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState242);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:151:1: ruleState : ( ( rule__State__NameAssignment ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:155:2: ( ( ( rule__State__NameAssignment ) ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:156:1: ( ( rule__State__NameAssignment ) )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:156:1: ( ( rule__State__NameAssignment ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:157:1: ( rule__State__NameAssignment )
            {
             before(grammarAccess.getStateAccess().getNameAssignment()); 
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:158:1: ( rule__State__NameAssignment )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:158:2: rule__State__NameAssignment
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_in_ruleState275);
            rule__State__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleRule"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:170:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:171:1: ( ruleRule EOF )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:172:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule302);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:179:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:183:2: ( ( ( rule__Rule__Group__0 ) ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:184:1: ( ( rule__Rule__Group__0 ) )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:184:1: ( ( rule__Rule__Group__0 ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:185:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:186:1: ( rule__Rule__Group__0 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:186:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule335);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleQualifiedName"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:198:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:199:1: ( ruleQualifiedName EOF )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:200:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName362);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:207:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:211:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:212:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:212:1: ( ( rule__QualifiedName__Group__0 ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:213:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:214:1: ( rule__QualifiedName__Group__0 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:214:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName395);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__Declaration__Alternatives"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:226:1: rule__Declaration__Alternatives : ( ( ruleDevice ) | ( ruleRule ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:230:1: ( ( ruleDevice ) | ( ruleRule ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:231:1: ( ruleDevice )
                    {
                    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:231:1: ( ruleDevice )
                    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:232:1: ruleDevice
                    {
                     before(grammarAccess.getDeclarationAccess().getDeviceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDevice_in_rule__Declaration__Alternatives431);
                    ruleDevice();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getDeviceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:237:6: ( ruleRule )
                    {
                    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:237:6: ( ruleRule )
                    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:238:1: ruleRule
                    {
                     before(grammarAccess.getDeclarationAccess().getRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRule_in_rule__Declaration__Alternatives448);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getRuleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__Device__Group__0"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:250:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:254:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:255:2: rule__Device__Group__0__Impl rule__Device__Group__1
            {
            pushFollow(FOLLOW_rule__Device__Group__0__Impl_in_rule__Device__Group__0478);
            rule__Device__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Device__Group__1_in_rule__Device__Group__0481);
            rule__Device__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0"


    // $ANTLR start "rule__Device__Group__0__Impl"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:262:1: rule__Device__Group__0__Impl : ( 'Device' ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:266:1: ( ( 'Device' ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:267:1: ( 'Device' )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:267:1: ( 'Device' )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:268:1: 'Device'
            {
             before(grammarAccess.getDeviceAccess().getDeviceKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Device__Group__0__Impl509); 
             after(grammarAccess.getDeviceAccess().getDeviceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0__Impl"


    // $ANTLR start "rule__Device__Group__1"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:281:1: rule__Device__Group__1 : rule__Device__Group__1__Impl rule__Device__Group__2 ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:285:1: ( rule__Device__Group__1__Impl rule__Device__Group__2 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:286:2: rule__Device__Group__1__Impl rule__Device__Group__2
            {
            pushFollow(FOLLOW_rule__Device__Group__1__Impl_in_rule__Device__Group__1540);
            rule__Device__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Device__Group__2_in_rule__Device__Group__1543);
            rule__Device__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1"


    // $ANTLR start "rule__Device__Group__1__Impl"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:293:1: rule__Device__Group__1__Impl : ( ( rule__Device__NameAssignment_1 ) ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:297:1: ( ( ( rule__Device__NameAssignment_1 ) ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:298:1: ( ( rule__Device__NameAssignment_1 ) )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:298:1: ( ( rule__Device__NameAssignment_1 ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:299:1: ( rule__Device__NameAssignment_1 )
            {
             before(grammarAccess.getDeviceAccess().getNameAssignment_1()); 
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:300:1: ( rule__Device__NameAssignment_1 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:300:2: rule__Device__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Device__NameAssignment_1_in_rule__Device__Group__1__Impl570);
            rule__Device__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1__Impl"


    // $ANTLR start "rule__Device__Group__2"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:310:1: rule__Device__Group__2 : rule__Device__Group__2__Impl rule__Device__Group__3 ;
    public final void rule__Device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:314:1: ( rule__Device__Group__2__Impl rule__Device__Group__3 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:315:2: rule__Device__Group__2__Impl rule__Device__Group__3
            {
            pushFollow(FOLLOW_rule__Device__Group__2__Impl_in_rule__Device__Group__2600);
            rule__Device__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Device__Group__3_in_rule__Device__Group__2603);
            rule__Device__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__2"


    // $ANTLR start "rule__Device__Group__2__Impl"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:322:1: rule__Device__Group__2__Impl : ( 'can' ) ;
    public final void rule__Device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:326:1: ( ( 'can' ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:327:1: ( 'can' )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:327:1: ( 'can' )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:328:1: 'can'
            {
             before(grammarAccess.getDeviceAccess().getCanKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Device__Group__2__Impl631); 
             after(grammarAccess.getDeviceAccess().getCanKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__2__Impl"


    // $ANTLR start "rule__Device__Group__3"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:341:1: rule__Device__Group__3 : rule__Device__Group__3__Impl rule__Device__Group__4 ;
    public final void rule__Device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:345:1: ( rule__Device__Group__3__Impl rule__Device__Group__4 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:346:2: rule__Device__Group__3__Impl rule__Device__Group__4
            {
            pushFollow(FOLLOW_rule__Device__Group__3__Impl_in_rule__Device__Group__3662);
            rule__Device__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Device__Group__4_in_rule__Device__Group__3665);
            rule__Device__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__3"


    // $ANTLR start "rule__Device__Group__3__Impl"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:353:1: rule__Device__Group__3__Impl : ( 'be' ) ;
    public final void rule__Device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:357:1: ( ( 'be' ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:358:1: ( 'be' )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:358:1: ( 'be' )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:359:1: 'be'
            {
             before(grammarAccess.getDeviceAccess().getBeKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Device__Group__3__Impl693); 
             after(grammarAccess.getDeviceAccess().getBeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__3__Impl"


    // $ANTLR start "rule__Device__Group__4"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:372:1: rule__Device__Group__4 : rule__Device__Group__4__Impl rule__Device__Group__5 ;
    public final void rule__Device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:376:1: ( rule__Device__Group__4__Impl rule__Device__Group__5 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:377:2: rule__Device__Group__4__Impl rule__Device__Group__5
            {
            pushFollow(FOLLOW_rule__Device__Group__4__Impl_in_rule__Device__Group__4724);
            rule__Device__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Device__Group__5_in_rule__Device__Group__4727);
            rule__Device__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__4"


    // $ANTLR start "rule__Device__Group__4__Impl"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:384:1: rule__Device__Group__4__Impl : ( ( rule__Device__StatesAssignment_4 ) ) ;
    public final void rule__Device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:388:1: ( ( ( rule__Device__StatesAssignment_4 ) ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:389:1: ( ( rule__Device__StatesAssignment_4 ) )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:389:1: ( ( rule__Device__StatesAssignment_4 ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:390:1: ( rule__Device__StatesAssignment_4 )
            {
             before(grammarAccess.getDeviceAccess().getStatesAssignment_4()); 
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:391:1: ( rule__Device__StatesAssignment_4 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:391:2: rule__Device__StatesAssignment_4
            {
            pushFollow(FOLLOW_rule__Device__StatesAssignment_4_in_rule__Device__Group__4__Impl754);
            rule__Device__StatesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getStatesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__4__Impl"


    // $ANTLR start "rule__Device__Group__5"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:401:1: rule__Device__Group__5 : rule__Device__Group__5__Impl ;
    public final void rule__Device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:405:1: ( rule__Device__Group__5__Impl )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:406:2: rule__Device__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Device__Group__5__Impl_in_rule__Device__Group__5784);
            rule__Device__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__5"


    // $ANTLR start "rule__Device__Group__5__Impl"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:412:1: rule__Device__Group__5__Impl : ( ( rule__Device__Group_5__0 )* ) ;
    public final void rule__Device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:416:1: ( ( ( rule__Device__Group_5__0 )* ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:417:1: ( ( rule__Device__Group_5__0 )* )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:417:1: ( ( rule__Device__Group_5__0 )* )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:418:1: ( rule__Device__Group_5__0 )*
            {
             before(grammarAccess.getDeviceAccess().getGroup_5()); 
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:419:1: ( rule__Device__Group_5__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:419:2: rule__Device__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Device__Group_5__0_in_rule__Device__Group__5__Impl811);
            	    rule__Device__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDeviceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__5__Impl"


    // $ANTLR start "rule__Device__Group_5__0"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:441:1: rule__Device__Group_5__0 : rule__Device__Group_5__0__Impl rule__Device__Group_5__1 ;
    public final void rule__Device__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:445:1: ( rule__Device__Group_5__0__Impl rule__Device__Group_5__1 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:446:2: rule__Device__Group_5__0__Impl rule__Device__Group_5__1
            {
            pushFollow(FOLLOW_rule__Device__Group_5__0__Impl_in_rule__Device__Group_5__0854);
            rule__Device__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Device__Group_5__1_in_rule__Device__Group_5__0857);
            rule__Device__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_5__0"


    // $ANTLR start "rule__Device__Group_5__0__Impl"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:453:1: rule__Device__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Device__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:457:1: ( ( ',' ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:458:1: ( ',' )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:458:1: ( ',' )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:459:1: ','
            {
             before(grammarAccess.getDeviceAccess().getCommaKeyword_5_0()); 
            match(input,14,FOLLOW_14_in_rule__Device__Group_5__0__Impl885); 
             after(grammarAccess.getDeviceAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_5__0__Impl"


    // $ANTLR start "rule__Device__Group_5__1"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:472:1: rule__Device__Group_5__1 : rule__Device__Group_5__1__Impl ;
    public final void rule__Device__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:476:1: ( rule__Device__Group_5__1__Impl )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:477:2: rule__Device__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Device__Group_5__1__Impl_in_rule__Device__Group_5__1916);
            rule__Device__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_5__1"


    // $ANTLR start "rule__Device__Group_5__1__Impl"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:483:1: rule__Device__Group_5__1__Impl : ( ( rule__Device__StatesAssignment_5_1 ) ) ;
    public final void rule__Device__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:487:1: ( ( ( rule__Device__StatesAssignment_5_1 ) ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:488:1: ( ( rule__Device__StatesAssignment_5_1 ) )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:488:1: ( ( rule__Device__StatesAssignment_5_1 ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:489:1: ( rule__Device__StatesAssignment_5_1 )
            {
             before(grammarAccess.getDeviceAccess().getStatesAssignment_5_1()); 
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:490:1: ( rule__Device__StatesAssignment_5_1 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:490:2: rule__Device__StatesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Device__StatesAssignment_5_1_in_rule__Device__Group_5__1__Impl943);
            rule__Device__StatesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getStatesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_5__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:504:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:508:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:509:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__0977);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__0980);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:516:1: rule__Rule__Group__0__Impl : ( 'Rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:520:1: ( ( 'Rule' ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:521:1: ( 'Rule' )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:521:1: ( 'Rule' )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:522:1: 'Rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Rule__Group__0__Impl1008); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:535:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:539:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:540:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11039);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11042);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:547:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__DescriptionAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:551:1: ( ( ( rule__Rule__DescriptionAssignment_1 ) ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:552:1: ( ( rule__Rule__DescriptionAssignment_1 ) )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:552:1: ( ( rule__Rule__DescriptionAssignment_1 ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:553:1: ( rule__Rule__DescriptionAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getDescriptionAssignment_1()); 
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:554:1: ( rule__Rule__DescriptionAssignment_1 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:554:2: rule__Rule__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__DescriptionAssignment_1_in_rule__Rule__Group__1__Impl1069);
            rule__Rule__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:564:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:568:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:569:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21099);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21102);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:576:1: rule__Rule__Group__2__Impl : ( 'when' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:580:1: ( ( 'when' ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:581:1: ( 'when' )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:581:1: ( 'when' )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:582:1: 'when'
            {
             before(grammarAccess.getRuleAccess().getWhenKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Rule__Group__2__Impl1130); 
             after(grammarAccess.getRuleAccess().getWhenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:595:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:599:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:600:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31161);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__31164);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:607:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__WhenAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:611:1: ( ( ( rule__Rule__WhenAssignment_3 ) ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:612:1: ( ( rule__Rule__WhenAssignment_3 ) )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:612:1: ( ( rule__Rule__WhenAssignment_3 ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:613:1: ( rule__Rule__WhenAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getWhenAssignment_3()); 
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:614:1: ( rule__Rule__WhenAssignment_3 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:614:2: rule__Rule__WhenAssignment_3
            {
            pushFollow(FOLLOW_rule__Rule__WhenAssignment_3_in_rule__Rule__Group__3__Impl1191);
            rule__Rule__WhenAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getWhenAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:624:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:628:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:629:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__41221);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__41224);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:636:1: rule__Rule__Group__4__Impl : ( 'then' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:640:1: ( ( 'then' ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:641:1: ( 'then' )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:641:1: ( 'then' )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:642:1: 'then'
            {
             before(grammarAccess.getRuleAccess().getThenKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Rule__Group__4__Impl1252); 
             after(grammarAccess.getRuleAccess().getThenKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:655:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:659:1: ( rule__Rule__Group__5__Impl )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:660:2: rule__Rule__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__51283);
            rule__Rule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:666:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__ThenAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:670:1: ( ( ( rule__Rule__ThenAssignment_5 ) ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:671:1: ( ( rule__Rule__ThenAssignment_5 ) )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:671:1: ( ( rule__Rule__ThenAssignment_5 ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:672:1: ( rule__Rule__ThenAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getThenAssignment_5()); 
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:673:1: ( rule__Rule__ThenAssignment_5 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:673:2: rule__Rule__ThenAssignment_5
            {
            pushFollow(FOLLOW_rule__Rule__ThenAssignment_5_in_rule__Rule__Group__5__Impl1310);
            rule__Rule__ThenAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getThenAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:695:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:699:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:700:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01352);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01355);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:707:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:711:1: ( ( RULE_ID ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:712:1: ( RULE_ID )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:712:1: ( RULE_ID )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:713:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1382); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:724:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2 ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:728:1: ( rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2 )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:729:2: rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11411);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__2_in_rule__QualifiedName__Group__11414);
            rule__QualifiedName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:736:1: rule__QualifiedName__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:740:1: ( ( '.' ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:741:1: ( '.' )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:741:1: ( '.' )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:742:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__QualifiedName__Group__1__Impl1442); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__2"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:755:1: rule__QualifiedName__Group__2 : rule__QualifiedName__Group__2__Impl ;
    public final void rule__QualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:759:1: ( rule__QualifiedName__Group__2__Impl )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:760:2: rule__QualifiedName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__2__Impl_in_rule__QualifiedName__Group__21473);
            rule__QualifiedName__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__2"


    // $ANTLR start "rule__QualifiedName__Group__2__Impl"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:766:1: rule__QualifiedName__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:770:1: ( ( RULE_ID ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:771:1: ( RULE_ID )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:771:1: ( RULE_ID )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:772:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__2__Impl1500); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__2__Impl"


    // $ANTLR start "rule__Model__DeclarationsAssignment"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:790:1: rule__Model__DeclarationsAssignment : ( ruleDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:794:1: ( ( ruleDeclaration ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:795:1: ( ruleDeclaration )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:795:1: ( ruleDeclaration )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:796:1: ruleDeclaration
            {
             before(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment1540);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DeclarationsAssignment"


    // $ANTLR start "rule__Device__NameAssignment_1"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:805:1: rule__Device__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Device__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:809:1: ( ( RULE_ID ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:810:1: ( RULE_ID )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:810:1: ( RULE_ID )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:811:1: RULE_ID
            {
             before(grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Device__NameAssignment_11571); 
             after(grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__NameAssignment_1"


    // $ANTLR start "rule__Device__StatesAssignment_4"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:820:1: rule__Device__StatesAssignment_4 : ( ruleState ) ;
    public final void rule__Device__StatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:824:1: ( ( ruleState ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:825:1: ( ruleState )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:825:1: ( ruleState )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:826:1: ruleState
            {
             before(grammarAccess.getDeviceAccess().getStatesStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Device__StatesAssignment_41602);
            ruleState();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getStatesStateParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__StatesAssignment_4"


    // $ANTLR start "rule__Device__StatesAssignment_5_1"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:835:1: rule__Device__StatesAssignment_5_1 : ( ruleState ) ;
    public final void rule__Device__StatesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:839:1: ( ( ruleState ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:840:1: ( ruleState )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:840:1: ( ruleState )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:841:1: ruleState
            {
             before(grammarAccess.getDeviceAccess().getStatesStateParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Device__StatesAssignment_5_11633);
            ruleState();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getStatesStateParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__StatesAssignment_5_1"


    // $ANTLR start "rule__State__NameAssignment"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:850:1: rule__State__NameAssignment : ( RULE_ID ) ;
    public final void rule__State__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:854:1: ( ( RULE_ID ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:855:1: ( RULE_ID )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:855:1: ( RULE_ID )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:856:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment1664); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment"


    // $ANTLR start "rule__Rule__DescriptionAssignment_1"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:865:1: rule__Rule__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Rule__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:869:1: ( ( RULE_STRING ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:870:1: ( RULE_STRING )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:870:1: ( RULE_STRING )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:871:1: RULE_STRING
            {
             before(grammarAccess.getRuleAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Rule__DescriptionAssignment_11695); 
             after(grammarAccess.getRuleAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__DescriptionAssignment_1"


    // $ANTLR start "rule__Rule__WhenAssignment_3"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:880:1: rule__Rule__WhenAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Rule__WhenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:884:1: ( ( ( ruleQualifiedName ) ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:885:1: ( ( ruleQualifiedName ) )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:885:1: ( ( ruleQualifiedName ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:886:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRuleAccess().getWhenStateCrossReference_3_0()); 
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:887:1: ( ruleQualifiedName )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:888:1: ruleQualifiedName
            {
             before(grammarAccess.getRuleAccess().getWhenStateQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Rule__WhenAssignment_31730);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getWhenStateQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getWhenStateCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__WhenAssignment_3"


    // $ANTLR start "rule__Rule__ThenAssignment_5"
    // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:899:1: rule__Rule__ThenAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Rule__ThenAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:903:1: ( ( ( ruleQualifiedName ) ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:904:1: ( ( ruleQualifiedName ) )
            {
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:904:1: ( ( ruleQualifiedName ) )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:905:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRuleAccess().getThenStateCrossReference_5_0()); 
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:906:1: ( ruleQualifiedName )
            // /home/red/Software/eclipse/workspace/org.xtext.ha.web/src-gen/org/xtext/ha/web/contentassist/antlr/internal/InternalRules.g:907:1: ruleQualifiedName
            {
             before(grammarAccess.getRuleAccess().getThenStateQualifiedNameParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Rule__ThenAssignment_51769);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getThenStateQualifiedNameParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getThenStateCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ThenAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevice_in_entryRuleDevice182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDevice189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Device__Group__0_in_ruleDevice215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_in_ruleState275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevice_in_rule__Declaration__Alternatives431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Declaration__Alternatives448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Device__Group__0__Impl_in_rule__Device__Group__0478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Device__Group__1_in_rule__Device__Group__0481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Device__Group__0__Impl509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Device__Group__1__Impl_in_rule__Device__Group__1540 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Device__Group__2_in_rule__Device__Group__1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Device__NameAssignment_1_in_rule__Device__Group__1__Impl570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Device__Group__2__Impl_in_rule__Device__Group__2600 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Device__Group__3_in_rule__Device__Group__2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Device__Group__2__Impl631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Device__Group__3__Impl_in_rule__Device__Group__3662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Device__Group__4_in_rule__Device__Group__3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Device__Group__3__Impl693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Device__Group__4__Impl_in_rule__Device__Group__4724 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Device__Group__5_in_rule__Device__Group__4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Device__StatesAssignment_4_in_rule__Device__Group__4__Impl754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Device__Group__5__Impl_in_rule__Device__Group__5784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Device__Group_5__0_in_rule__Device__Group__5__Impl811 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Device__Group_5__0__Impl_in_rule__Device__Group_5__0854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Device__Group_5__1_in_rule__Device__Group_5__0857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Device__Group_5__0__Impl885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Device__Group_5__1__Impl_in_rule__Device__Group_5__1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Device__StatesAssignment_5_1_in_rule__Device__Group_5__1__Impl943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__0977 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__0980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Rule__Group__0__Impl1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11039 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__DescriptionAssignment_1_in_rule__Rule__Group__1__Impl1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Rule__Group__2__Impl1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31161 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__31164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__WhenAssignment_3_in_rule__Rule__Group__3__Impl1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__41221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__41224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Rule__Group__4__Impl1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__51283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ThenAssignment_5_in_rule__Rule__Group__5__Impl1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01352 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__2_in_rule__QualifiedName__Group__11414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__QualifiedName__Group__1__Impl1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__2__Impl_in_rule__QualifiedName__Group__21473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__2__Impl1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Device__NameAssignment_11571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Device__StatesAssignment_41602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Device__StatesAssignment_5_11633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Rule__DescriptionAssignment_11695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Rule__WhenAssignment_31730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Rule__ThenAssignment_51769 = new BitSet(new long[]{0x0000000000000002L});

}