package santa.barbara.lateinitbottom.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import santa.barbara.lateinitbottom.R
import santa.barbara.lateinitbottom.databinding.FragmentNotificationsBinding
import santa.barbara.lateinitbottom.login
import kotlin.math.log

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root


        notificationsViewModel.text.observe(viewLifecycleOwner) {

        }



        val correoGlobal = login.variablesGlobalesLogin.correoIngresado



        //Mando a traer el texto que está en la pantalla
        val correoIngresado = root.findViewById<TextView>(R.id.txtCorreoEscrito)
        //A ese texto de mi pantalla le pongo el valor que es global
        correoIngresado.text = correoGlobal

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}