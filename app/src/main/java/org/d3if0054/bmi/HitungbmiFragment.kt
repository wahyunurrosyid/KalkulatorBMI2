package org.d3if0054.bmi


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_hitungbmi.*
import org.d3if0054.bmi.databinding.FragmentHitungbmiBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class HitungbmiFragment : Fragment() {

    private var bb = 0
    private var ti = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: FragmentHitungbmiBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_hitungbmi, container, false
        )

        binding.bHitung.setOnClickListener {
            hitungBmi()
        }

        setHasOptionsMenu(true)
        return binding.root
    }

    private fun hitungBmi() {
        var a:EditText = ed_bb.text

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
