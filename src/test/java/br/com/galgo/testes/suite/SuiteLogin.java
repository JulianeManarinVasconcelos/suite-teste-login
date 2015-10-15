package br.com.galgo.testes.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.com.galgo.testes.recursos_comuns.suite.StopOnFirstFailureSuite;
import br.com.galgo.testes.recursos_comuns.teste.TesteLogin;

@RunWith(StopOnFirstFailureSuite.class)
@Suite.SuiteClasses({ TesteLogin.class })
public class SuiteLogin {

}
